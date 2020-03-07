package com.github.ecbp.store.service.entity;

import com.github.ecbp.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsAlbumPic extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -4697984235987888264L;

    private Long albumId;

    private String pic;

}