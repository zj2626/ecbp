package com.github.ecbp.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 对象拷贝转换工具类
 */
public class TransformUtils {
    public static <T> T transform(Object sourse, T target) {
        if (null == sourse) {
            return target;
        }
        BeanUtils.copyProperties(sourse, target);
        return target;
    }

    public static <T> List<T> listTransform(List sourse, Class<T> targetClass) {
        if (CollectionUtils.isEmpty(sourse)) {
            return Collections.emptyList();
        }
        List<T> target = new ArrayList<>(sourse.size());
        Collections.copy(target, sourse);
        if (CollectionUtils.isEmpty(target)) {
            return Collections.emptyList();
        }
        return target;
    }
}
