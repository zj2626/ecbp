package com.github.ecbp.store.service.impl;

import com.github.ecbp.store.feignapi.StoreServiceFunApiClient;
import com.github.ecbp.store.service.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunServiceImpl implements FunService {

    @Autowired
    private StoreServiceFunApiClient storeServiceFunApiClient;

    @Override
    public String fun(String name) {
        return storeServiceFunApiClient.fun(name);
    }
}

