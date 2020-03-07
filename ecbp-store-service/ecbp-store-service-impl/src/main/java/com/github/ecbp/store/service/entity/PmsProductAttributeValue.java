package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsProductAttributeValue extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1242535500653273119L;

    private Long productId;

    private Long productAttributeId;

    @ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

}