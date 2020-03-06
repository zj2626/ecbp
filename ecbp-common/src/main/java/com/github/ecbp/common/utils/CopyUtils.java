package com.github.ecbp.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对象拷贝转换工具类
 */
public class CopyUtils {
    public static <T> T copy(Object obj, T target) {
        if (null == obj) {
            return target;
        }

        BeanUtils.copyProperties(obj, target);
        return target;
    }

    public static <T> List<T> listCopy(List sourse, Class<T> targetClass) {
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
