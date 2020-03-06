package com.github.ecbp.store.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface PmsProductApi {

    @PostMapping("/store/getById")
    String getById(Integer id);
}
