package com.dong.service;

import com.dong.pojo.Depart;

import java.util.List;

/**
 * 类描述： 部门service接口
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:20
 */
public interface DepartService {

    /**
     *  保存部门
     * @param depart
     * @return
     */
    boolean saveDepart(Depart depart);

    /**
     * 根据id删除部门
     * @param id
     * @return
     */
    boolean removeDepartById(Integer id);

    /**
     * 修改部门信息
     * @param depart
     * @return
     */
    boolean modifyDepart(Depart depart);

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    Depart getDepartById(Integer id);

    /**
     * 查询所有部门
     * @return
     */
    List<Depart> listAllDeparts();

}
