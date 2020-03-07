package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsProductCategoryAttributeRelation extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 8772837724764482091L;

    private Long productCategoryId;

    private Long productAttributeId;

}