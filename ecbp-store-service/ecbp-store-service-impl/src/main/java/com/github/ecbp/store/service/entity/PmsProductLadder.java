package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PmsProductLadder extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 5842155072732703985L;

    private Long productId;

    @ApiModelProperty(value = "满足的商品数量")
    private Integer count;

    @ApiModelProperty(value = "折扣")
    private BigDecimal discount;

    @ApiModelProperty(value = "折后价格")
    private BigDecimal price;

}