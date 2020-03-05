package com.github.ecbp.order.controller;

import com.github.ecbp.order.api.OrderFunApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController implements OrderFunApi {

    @Override
    public String fun(@RequestBody String name) {
        return "ecbp-order-impl: this is hello world client by " + name;
    }
}

