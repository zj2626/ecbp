package com.github.ecbp.store.service.service.impl;

import com.github.ecbp.common.data.service.impl.BaseServiceImpl;
import com.github.ecbp.store.service.entity.PmsProduct;
import com.github.ecbp.store.service.mapper.PmsProductMapper;
import com.github.ecbp.store.service.service.PmsProductService;
import org.springframework.stereotype.Service;

@Service
public class PmsProductServiceImpl extends BaseServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService<PmsProduct> {

    @Override
    public PmsProduct getById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }
}
