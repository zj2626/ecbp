package com.github.ecbp.store.service.service.impl;

import com.github.ecbp.common.data.service.impl.BaseServiceImpl;
import com.github.ecbp.store.service.entity.PmsProductAttribute;
import com.github.ecbp.store.service.mapper.PmsProductAttributeMapper;
import com.github.ecbp.store.service.service.PmsProductAttributeService;
import org.springframework.stereotype.Service;

@Service
public class PmsProductAttributeServiceImpl extends BaseServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements PmsProductAttributeService<PmsProductAttribute> {
}
