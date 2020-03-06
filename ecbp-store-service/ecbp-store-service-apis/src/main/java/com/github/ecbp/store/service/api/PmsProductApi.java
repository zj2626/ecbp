package com.github.ecbp.store.service.api;

import com.github.ecbp.store.service.param.PmsProductDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 商品信息API
 *
 * @author zhangj
 * @version $Id: PmsProductApi.java, v 0.1 2020/3/6 20:29 zhangj Exp $
 */
public interface PmsProductApi {

    @PostMapping("/service/store/product/getById")
    @ApiOperation(value = "测试接口", notes = "测试接口")
    PmsProductDTO getById(Integer id);
}
