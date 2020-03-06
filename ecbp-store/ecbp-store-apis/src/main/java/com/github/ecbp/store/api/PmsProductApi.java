package com.github.ecbp.store.api;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * 商品信息
 *
 * @author zhangj
 * @version $Id: PmsProductApi.java, v 0.1 2020/3/6 20:47 zhangj Exp $
 */
public interface PmsProductApi {

    /**
     * 测试方法
     *
     * @param id
     * @return
     */
    @PostMapping("/store/getById")
    String getById(Integer id);
}
