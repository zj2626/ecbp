package com.github.ecbp.common.data.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * 查询
     *
     * @param entity
     * @return
     */
    T selectOne(T entity);

    /**
     * 通过Id查询
     *
     * @param id
     * @return
     */
    T selectById(Object id);

    /**
     * 根据ID集合来查询
     *
     * @param ids
     * @return
     */
//    List<T> selectListByIds(List<Object> ids);

    /**
     * 查询列表
     *
     * @param entity
     * @return
     */
    List<T> selectList(T entity);


    /**
     * 获取所有对象
     *
     * @return
     */
    List<T> selectListAll();


    /**
     * 查询总记录数
     *
     * @return
     */
//    Long selectCountAll();

    /**
     * 查询总记录数
     *
     * @param entity
     * @return
     */
    Long selectCount(T entity);

    /**
     * 添加
     *
     * @param entity
     */
    Integer insert(T entity);


    /**
     * 插入 不插入null字段
     *
     * @param entity
     */
    Integer insertSelective(T entity);

    /**
     * 删除
     *
     * @param entity
     */
    Integer delete(T entity);

    /**
     * 根据Id删除
     *
     * @param id
     */
    //    Integer deleteById(Object id);


    /**
     * 根据id更新
     *
     * @param entity
     */
    Integer updateById(T entity);


    /**
     * 不update null
     *
     * @param entity
     */
    Integer updateSelectiveById(T entity);

    /**
     * 根据ID集合批量删除
     *
     * @param ids
     */
//    Integer deleteBatchByIds(List<Object> ids);


    /**
     * 批量更新
     *
     * @param entitys
     */
//    Integer updateBatch(List<T> entitys);
}
