package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PmsProductFullReduction extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -4995828396714229273L;

    private Long productId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

}