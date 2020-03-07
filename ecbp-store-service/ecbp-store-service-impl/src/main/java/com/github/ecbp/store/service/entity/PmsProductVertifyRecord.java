package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PmsProductVertifyRecord extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3145433745504771638L;

    private Long productId;

    private Date createTime;

    @ApiModelProperty(value = "审核人")
    private String vertifyMan;

    private Integer status;

    @ApiModelProperty(value = "反馈详情")
    private String detail;

}