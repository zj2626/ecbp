package com.github.ecbp.store.service.config;

import com.alibaba.fastjson.JSON;
import com.github.ecbp.common.entity.BaseEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

//@EnableAspectJAutoProxy  TODO 待完成
//@Aspect
//@Component
public class ServiceRedisConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRedisConfig.class);
    private static final String REDIS_KEY_PREFIX = "PmsProduct_";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Around("(execution(public * com.github.ecbp.common.data.service.impl.BaseServiceImpl.selectById(Object)))")
    public Object addRedisOperation(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        if (!isInvalidParams(args)) {
            Object redisValue = redisTemplate.opsForValue().get(REDIS_KEY_PREFIX + args[0].toString());
            if (null != redisValue) { // ??????
                BaseEntity result = JSON.parseObject(redisValue.toString(), BaseEntity.class);
                return null == result || StringUtils.isEmpty(result.getId()) ? null : result;
            }
        }

        Object result = null;
        try {
            result = joinPoint.proceed(args);
        } catch (Exception ex) {
            LOGGER.error("发生异常", ex);
            throw ex;
        } finally {
            if (!isInvalidParams(args)) {
                if (null != result) {
                    redisTemplate.opsForValue().set(REDIS_KEY_PREFIX + args[0].toString(), JSON.toJSONString(result));
                } else {
                    redisTemplate.opsForValue().set(REDIS_KEY_PREFIX + args[0].toString(), "{}");
                }
                redisTemplate.expire(REDIS_KEY_PREFIX + args[0].toString(), 24, TimeUnit.HOURS);
            }
        }
        return result;
    }

    /**
     * 判断方法参数是否是合法参数
     *
     * @param args
     * @return
     */
    private boolean isInvalidParams(Object[] args) {
        return null == args || args.length != 1;
    }
}
