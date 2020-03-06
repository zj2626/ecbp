package com.github.ecbp.store.service.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface PmsProductAttributeApi {

    @PostMapping("/service/store/product/attribute/getById")
    String getById(Integer id);
}
