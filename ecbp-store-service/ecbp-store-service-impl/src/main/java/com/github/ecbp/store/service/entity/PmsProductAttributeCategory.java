package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsProductAttributeCategory extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 6103286310308325460L;

    private String name;

    @ApiModelProperty(value = "属性数量")
    private Integer attributeCount;

    @ApiModelProperty(value = "参数数量")
    private Integer paramCount;

}