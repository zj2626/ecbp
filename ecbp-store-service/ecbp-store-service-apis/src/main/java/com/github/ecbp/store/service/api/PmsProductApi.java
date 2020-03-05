package com.github.ecbp.store.service.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface PmsProductApi {

    @PostMapping("/service/store/fun1")
    String fun(Integer id);
}
