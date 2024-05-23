package com.dong.service.impl;

import com.dong.pojo.Depart;
import com.dong.repository.DepartRepository;
import com.dong.service.DepartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：部门service实现类
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:23
 */
@Service
@RequiredArgsConstructor
public class DepartServiceImpl implements DepartService {

    private final DepartRepository departRepository;

    @Override
    public boolean saveDepart(Depart depart) {
        if (departRepository.save(depart) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartById(Integer id) {
        // 指定id不存在，会抛出异常
        if (departRepository.existsById(id)) {
            departRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        if (departRepository.save(depart) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(Integer id) {
        if (departRepository.existsById(id)) {
            return departRepository.findById(id).get();
        }
        Depart depart = Depart.builder().name("no this depart").build();
        return depart;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return departRepository.findAll();
    }
}
