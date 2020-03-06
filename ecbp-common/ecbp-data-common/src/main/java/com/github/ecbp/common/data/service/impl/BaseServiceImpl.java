package com.github.ecbp.common.data.service.impl;

import com.github.ecbp.common.data.mapper.BaseMapper;
import com.github.ecbp.common.data.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<M extends BaseMapper<T>, T> implements BaseService<T> {
    @Autowired
    protected M mapper;

    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

//    @Override
//    public List<T> selectListByIds(List<Object> ids) {
//        return mapper.selectByIds(ids);
//    }

    public List<T> selectList(T entity) {
        return mapper.select(entity);
    }

    public List<T> selectListAll() {
        return mapper.selectAll();
    }

//    @Override
//    public Long selectCountAll() {
//        return mapper.selectCount();
//    }

    public Long selectCount(T entity) {
        return Long.valueOf(mapper.selectCount(entity));
    }

    public void insert(T entity) {
        mapper.insert(entity);
    }

    public void insertSelective(T entity) {
        mapper.insertSelective(entity);
    }

    public void delete(T entity) {
        mapper.delete(entity);
    }

    public void deleteById(Object id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void updateById(T entity) {
        mapper.updateByPrimaryKey(entity);
    }

    public void updateSelectiveById(T entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

//    @Override
//    public void deleteBatchByIds(List<Object> ids) {
//        mapper.batchDeleteByIds(ids);
//    }
//
//    @Override
//    public void updateBatch(List<T> entitys) {
//        mapper.batchUpdate(entitys);
//    }
}
