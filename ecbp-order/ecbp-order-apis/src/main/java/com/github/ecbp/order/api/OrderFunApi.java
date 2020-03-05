package com.github.ecbp.order.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface OrderFunApi {

    @PostMapping("/order/fun1")
    String fun(String name);
}
