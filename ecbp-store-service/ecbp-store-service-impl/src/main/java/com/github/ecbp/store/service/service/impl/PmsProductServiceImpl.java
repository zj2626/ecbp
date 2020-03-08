package com.github.ecbp.store.service.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.ecbp.common.data.service.impl.BaseServiceImpl;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.mapper.PmsProductMapper;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

@Service
public class PmsProductServiceImpl extends BaseServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService<PmsProduct> {

    private static final String REDIS_KEY_PREFIX = "PmsProduct_";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public PmsProduct getById(Object id) {
        Object redisValue = redisTemplate.opsForValue().get(REDIS_KEY_PREFIX + id.toString());
        if (null != redisValue) {
            PmsProduct result = JSON.parseObject(redisValue.toString(), PmsProduct.class);
            return null == result || StringUtils.isEmpty(result.getId()) ? null : result;
        }

        PmsProduct result = mapper.selectByPrimaryKey(id);
        if (null != result) {
            redisTemplate.opsForValue().set(REDIS_KEY_PREFIX + id.toString(), JSON.toJSONString(result));
        } else {
            redisTemplate.opsForValue().set(REDIS_KEY_PREFIX + id.toString(), "{}");
        }
        redisTemplate.expire(REDIS_KEY_PREFIX + id.toString(), 24, TimeUnit.HOURS);

        return result;
    }
}
