package com.github.ecbp.store.service;

import com.github.ecbp.store.service.param.PmsProductDTO;

/**
 * 商品信息业务操作
 *
 * @author zhangj
 * @version $Id: PmsProductService.java, v 0.1 2020/3/6 20:47 zhangj Exp $
 */
public interface PmsProductService {

    /**
     * 测试方法
     *
     * @param id
     * @return
     */
    PmsProductDTO getById(Integer id);
}

