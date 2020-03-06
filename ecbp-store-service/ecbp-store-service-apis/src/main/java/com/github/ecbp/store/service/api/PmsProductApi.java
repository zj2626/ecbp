package com.github.ecbp.store.service.api;

import com.github.ecbp.store.service.param.PmsProductDTO;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * TODO 违反了 最小依赖原则 待解决
 */
public interface PmsProductApi {

    @PostMapping("/service/store/product/getById")
    PmsProductDTO getById(Integer id);
}
