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

    @PostMapping("/service/store/product/selectById")
    @ApiOperation(value = "通过ID查询")
    PmsProductDTO selectById(Long id);

    @PostMapping("/service/store/product/insert")
    @ApiOperation(value = "插入")
    Integer insert(PmsProductDTO param);

    @PostMapping("/service/store/product/update")
    @ApiOperation(value = "更新")
    Integer update(PmsProductDTO param);

    @PostMapping("/service/store/product/delete")
    @ApiOperation(value = "删除[逻辑删除]")
    Integer delete(Long id);

    @ApiOperation(value = "商品列表[分页]")
    @PostMapping("/service/store/product/getListByPage")
    String getListByPage(Object param);
}
