package com.github.ecbp.store.service.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 商品属性参数API
 *
 * @author zhangj
 * @version $Id: PmsProductAttributeApi.java, v 0.1 2020/3/6 20:39 zhangj Exp $
 */
public interface PmsProductAttributeApi {

    @ApiOperation(value = "测试接口", notes = "测试接口")
    @PostMapping("/service/store/product/attribute/getById")
    String getById(Integer id);
}
