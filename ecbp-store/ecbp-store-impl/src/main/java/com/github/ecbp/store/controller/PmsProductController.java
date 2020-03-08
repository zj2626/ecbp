package com.github.ecbp.store.controller;

import com.github.ecbp.store.service.PmsProductService;
import com.github.ecbp.store.service.param.PmsProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    /**
     * 测试方法
     *
     * @param id
     * @return
     */
    @PostMapping("/store/getById")
    public String getById(@RequestBody Integer id) {
        return Optional.ofNullable(pmsProductService.getById(id)).map(PmsProductDTO::toString).orElse(null);
    }
}

