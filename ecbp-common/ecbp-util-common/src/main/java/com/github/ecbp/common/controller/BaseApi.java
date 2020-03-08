package com.github.ecbp.common.controller;

public interface BaseApi<DTO, ID> {

    DTO selectById(ID id);

    Integer insert(DTO param);

    Integer update(DTO param);

    Integer delete(ID id);
}
