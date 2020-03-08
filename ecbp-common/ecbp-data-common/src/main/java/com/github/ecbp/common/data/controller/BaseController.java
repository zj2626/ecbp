package com.github.ecbp.common.data.controller;

import com.github.ecbp.common.data.service.BaseService;
import com.github.ecbp.common.entity.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<S extends BaseService<T>, T extends BaseEntity> {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected S service;
}
