package com.github.ecbp.store.service.service.impl;

import com.github.ecbp.common.data.service.impl.BaseServiceImpl;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.mapper.PmsProductMapper;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class PmsProductServiceImpl extends BaseServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService<PmsProduct> {

    private static final String REDIS_KEY_PREFIX = "PmsProduct_";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public PmsProduct getById(Object id) {
        PmsProduct result = mapper.selectByPrimaryKey(id);
        return result;
    }
}
