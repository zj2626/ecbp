package com.github.ecbp.order.service.controller;

import com.github.ecbp.order.service.api.OrderServiceFunApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController implements OrderServiceFunApi {

    @Override
    public String fun(@RequestBody String name) {
        return "ecbp-store-service-impl: this is hello world client by " + name;
    }
}

