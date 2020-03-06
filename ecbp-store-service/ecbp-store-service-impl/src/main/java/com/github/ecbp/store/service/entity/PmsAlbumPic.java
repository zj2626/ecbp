package com.github.ecbp.store.service.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class PmsAlbumPic implements Serializable {
    private static final long serialVersionUID = -4697984235987888264L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long albumId;

    private String pic;

}