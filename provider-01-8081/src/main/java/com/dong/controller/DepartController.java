package com.dong.controller;

import com.dong.pojo.Depart;
import com.dong.service.DepartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 类描述：部门的controller类
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:27
 */
@RestController
@RequestMapping("/provider/depart")
@RequiredArgsConstructor
public class DepartController {
    private final DepartService departService;

    @PostMapping("/save")
    public boolean saveHandler(@RequestBody Depart depart)
    {
        return departService.saveDepart(depart);
    }

    @DeleteMapping("/delete/{id}")
    public boolean removeHandler(@PathVariable Integer id)
    {
        return departService.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean modifyHandler(@RequestBody Depart depart)
    {
        return departService.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandler(@PathVariable Integer id)
    {
        return departService.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandler()
    {
        return departService.listAllDeparts();
    }
}
