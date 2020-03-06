package com.github.ecbp.store.service.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class PmsProductCategoryAttributeRelation implements Serializable {
    private static final long serialVersionUID = 8772837724764482091L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long productCategoryId;

    private Long productAttributeId;

}