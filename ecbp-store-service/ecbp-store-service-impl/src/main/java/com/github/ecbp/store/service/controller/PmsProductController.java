package com.github.ecbp.store.service.controller;

import com.github.ecbp.common.data.controller.BaseController;
import com.github.ecbp.common.utils.CopyUtils;
import com.github.ecbp.store.service.api.PmsProductApi;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.param.PmsProductDTO;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PmsProductController extends BaseController<PmsProductService<PmsProduct>, PmsProduct> implements PmsProductApi {

    @Override
    public PmsProductDTO getById(@RequestBody Integer id) {
        PmsProduct product = service.selectById(id);
        return Optional.ofNullable(product).map(p -> CopyUtils.copy(p, new PmsProductDTO())).orElse(null);
    }
}

