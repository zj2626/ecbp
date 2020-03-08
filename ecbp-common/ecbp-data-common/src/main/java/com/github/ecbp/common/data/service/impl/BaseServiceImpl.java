package com.github.ecbp.common.data.service.impl;

import com.github.ecbp.common.data.mapper.BaseMapper;
import com.github.ecbp.common.data.service.BaseService;
import com.github.ecbp.common.entity.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> implements BaseService<T> {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

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

    public Integer insert(T entity) {
        entity.setId(null);
        return mapper.insert(entity);
    }

    public Integer insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    public Integer delete(T entity) {
        entity.setDeleteStatus(1);
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public Integer updateById(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public Integer updateSelectiveById(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    //    public Integer delete(T entity) {
    //        return mapper.delete(entity);
    //    }
    //
    //    public Integer deleteById(Object id) {
    //        return mapper.deleteByPrimaryKey(id);
    //    }
    //    @Override
    //    public Integer deleteBatchByIds(List<Object> ids) {
    //        return mapper.batchDeleteByIds(ids);
    //    }
    //
    //    @Override
    //    public Integer updateBatch(List<T> entitys) {
    //        return mapper.batchUpdate(entitys);
    //    }
}
