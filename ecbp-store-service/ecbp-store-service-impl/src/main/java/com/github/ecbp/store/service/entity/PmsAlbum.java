package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsAlbum extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 2077031212068851049L;

    private String name;

    private String coverPic;

    private Integer picCount;

    private Integer sort;

    private String description;

}