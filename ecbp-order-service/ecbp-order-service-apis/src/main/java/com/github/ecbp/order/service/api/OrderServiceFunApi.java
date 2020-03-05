package com.github.ecbp.order.service.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface OrderServiceFunApi {

    @PostMapping("/service/order/fun1")
    String fun(String name);
}
