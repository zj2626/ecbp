package com.github.ecbp.store.service.service;

import com.github.ecbp.common.data.service.BaseService;
import com.github.ecbp.store.service.entity.PmsProduct;

public interface PmsProductService<T> extends BaseService<T> {
    PmsProduct getById(Object id);
}
