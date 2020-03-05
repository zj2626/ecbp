package com.github.ecbp.store.service.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface StoreServiceFunApi {

    @PostMapping("/service/store/fun1")
    String fun(String name);
}
