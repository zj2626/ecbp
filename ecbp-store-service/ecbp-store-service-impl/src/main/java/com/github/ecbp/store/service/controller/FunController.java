package com.github.ecbp.store.service.controller;

import com.github.ecbp.store.service.api.StoreServiceFunApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController implements StoreServiceFunApi {

    @Override
    public String fun(@RequestBody String name) {
        return "ecbp-store-service-impl: this is hello world client by " + name;
    }
}

