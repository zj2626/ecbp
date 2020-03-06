package com.github.ecbp.store.service.controller;

import com.github.ecbp.common.controller.BaseController;
import com.github.ecbp.store.service.api.PmsProductAttributeApi;
import com.github.ecbp.store.service.entity.PmsProductAttribute;
import com.github.ecbp.store.service.service.PmsProductAttributeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmsProductAttributeController extends BaseController<PmsProductAttributeService<PmsProductAttribute>, PmsProductAttribute> implements PmsProductAttributeApi {

    @Override
    public String getById(@RequestBody Integer id) {
        return "success" + id;
    }
}

