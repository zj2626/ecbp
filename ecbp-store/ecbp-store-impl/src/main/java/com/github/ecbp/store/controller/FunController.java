package com.github.ecbp.store.controller;

import com.github.ecbp.store.api.FunApi;
import com.github.ecbp.store.service.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController implements FunApi {

    @Autowired
    private FunService funService;

    @Override
    public String fun(@RequestBody String name) {
        return funService.fun(name);
    }
}

