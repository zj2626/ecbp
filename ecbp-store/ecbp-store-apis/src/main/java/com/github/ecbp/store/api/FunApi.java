package com.github.ecbp.store.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface FunApi {

    @PostMapping("/store/fun1")
    String fun(String name);
}
