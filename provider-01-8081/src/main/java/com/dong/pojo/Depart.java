package com.dong.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类描述： 部门类
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:17
 */
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","fieldHandler"})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Depart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
