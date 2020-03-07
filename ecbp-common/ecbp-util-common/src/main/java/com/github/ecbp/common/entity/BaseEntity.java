package com.github.ecbp.common.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略, 可以使用tk.mybatis下的@KeySql替换
    private Long id;
}
