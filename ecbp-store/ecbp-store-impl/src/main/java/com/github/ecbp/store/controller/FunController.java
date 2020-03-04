package com.github.ecbp.store.controller;

import com.github.ecbp.store.api.FunApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController implements FunApi {

    @Override
    public String fun(@RequestBody String name) {
        return "this is hello world client by " + name;
    }
}

