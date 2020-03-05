package com.github.ecbp.common.controller;

import com.github.ecbp.common.service.BaseService;
import com.github.ecbp.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<S extends BaseService<T>, T>{
    @Autowired
    protected S service;
}
