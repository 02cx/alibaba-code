package com.dong.repository;

import com.dong.pojo.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类描述：部门的Repository接口
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:19
 */
public interface  DepartRepository extends JpaRepository<Depart, Integer> {
}
