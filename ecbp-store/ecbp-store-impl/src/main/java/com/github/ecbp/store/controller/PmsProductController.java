package com.github.ecbp.store.controller;

import com.github.ecbp.store.api.PmsProductApi;
import com.github.ecbp.store.service.PmsProductService;
import com.github.ecbp.store.service.param.PmsProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PmsProductController implements PmsProductApi {

    @Autowired
    private PmsProductService pmsProductService;

    @Override
    public String getById(@RequestBody Integer id) {
        return Optional.ofNullable(pmsProductService.getById(id)).map(PmsProductDTO::toString).orElse(null);
    }
}

