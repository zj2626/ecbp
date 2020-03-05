package com.github.ecbp.store.service.controller;

import com.github.ecbp.common.controller.BaseController;
import com.github.ecbp.store.service.api.PmsProductApi;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmsProductController extends BaseController<PmsProductService<PmsProduct>, PmsProduct> implements PmsProductApi {

    @Override
    public String fun(@RequestBody Integer id) {
        PmsProduct product = service.selectById(id);
        System.out.println(product);
        return "ecbp-store-service-impl: this is hello world client by " + id;
    }
}

