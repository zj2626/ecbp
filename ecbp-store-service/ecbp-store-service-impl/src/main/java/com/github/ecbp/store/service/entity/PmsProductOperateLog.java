package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductOperateLog extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -7973179768633794787L;

    private Long productId;

    private BigDecimal priceOld;

    private BigDecimal priceNew;

    private BigDecimal salePriceOld;

    private BigDecimal salePriceNew;

    @ApiModelProperty(value = "赠送的积分")
    private Integer giftPointOld;

    private Integer giftPointNew;

    private Integer usePointLimitOld;

    private Integer usePointLimitNew;

    @ApiModelProperty(value = "操作人")
    private String operateMan;

    private Date createTime;

}