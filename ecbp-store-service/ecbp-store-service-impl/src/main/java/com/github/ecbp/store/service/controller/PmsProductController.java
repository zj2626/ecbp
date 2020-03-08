package com.github.ecbp.store.service.controller;

import com.github.ecbp.common.data.controller.BaseController;
import com.github.ecbp.common.utils.TransformUtils;
import com.github.ecbp.store.service.api.PmsProductApi;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.param.PmsProductDTO;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmsProductController extends BaseController<PmsProductService<PmsProduct, Long>, PmsProduct, Long> implements PmsProductApi<PmsProductDTO, Long> {

    @Override
    public PmsProductDTO selectById(@RequestBody Long id) {
        PmsProduct result = service.selectById(id);
        return TransformUtils.transform(result, new PmsProductDTO());
    }

    @Override
    public Integer insert(@RequestBody PmsProductDTO param) {
        return service.insert(TransformUtils.transform(param, new PmsProduct()));
    }

    @Override
    public Integer update(@RequestBody PmsProductDTO param) {
        return service.updateById(TransformUtils.transform(param, new PmsProduct()));
    }

    @Override
    public Integer delete(@RequestBody Long id) {
        PmsProduct param = new PmsProduct();
        param.setId(id);
        return service.delete(param);
    }

    @Override
    public String getListByPage(@RequestBody Object param) {
        return null;
    }
}

