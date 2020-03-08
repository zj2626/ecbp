package com.github.ecbp.store.service.impl;

import com.github.ecbp.store.feignapi.PmsProductApiClient;
import com.github.ecbp.store.service.PmsProductService;
import com.github.ecbp.store.service.param.PmsProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductApiClient pmsProductApiClient;

    @Override
    public PmsProductDTO selectById(Long id) {
        return pmsProductApiClient.selectById(id);
    }
}

