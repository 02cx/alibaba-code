package com.dong.controller;

import com.dong.pojo.Depart;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 类描述：部门controller
 *
 * @author wuyadong
 * @date 2024/5/23 下午11:45
 */
@RestController
@RequestMapping("/consumer/depart")
@RequiredArgsConstructor
public class DeaprtController {

    private final RestTemplate restTemplate;

    private static final String SERVICE_PROVIDER = "http://localhost:8081/provider/depart";

    @PostMapping("/save")
    public boolean saveHandler(@RequestBody Depart depart) {
        String url = SERVICE_PROVIDER + "/save";
        return restTemplate.postForObject(url, depart, Boolean.class);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHandler(@PathVariable Integer id){
        restTemplate.delete(SERVICE_PROVIDER + "/delete/{id}", id);
    }

    @PutMapping("/update")
    public void updateHandler(@RequestBody Depart depart) {
        restTemplate.put(SERVICE_PROVIDER + "/update", depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandler(@PathVariable Integer id) {
        return restTemplate.getForObject(SERVICE_PROVIDER + "/get/" + id, Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> listHandler() {
        return restTemplate.getForObject(SERVICE_PROVIDER + "/list", List.class);
    }

}
