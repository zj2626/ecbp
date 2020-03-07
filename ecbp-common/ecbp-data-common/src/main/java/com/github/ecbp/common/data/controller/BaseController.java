package com.github.ecbp.common.data.controller;

import com.github.ecbp.common.data.service.BaseService;
import com.github.ecbp.common.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<S extends BaseService<T>, T extends BaseEntity> {
    @Autowired
    protected S service;
}
