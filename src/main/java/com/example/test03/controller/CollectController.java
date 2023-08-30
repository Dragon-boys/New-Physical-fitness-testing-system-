package com.example.test03.controller;

import com.example.test03.bean.collect.Collect;
import com.example.test03.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectController {
    @Autowired
    private CollectService collectService;

    /**
     * 根据id数组查询数据
     * @param id
     * @return
     */
    @PostMapping("/collect/selectAllByIdList")
    public List<Collect> selectAll(@RequestBody List<Long> id){
        return collectService.selectAll(id);
    }

    /**
     * 根据数组Collect类插入数据
     * @param collect
     * @return
     */
    @PostMapping("/collect/insertBatch")
    public int selectById(@RequestBody List<Collect> collect){
        int count = 0;
        count += collectService.insertBatch(collect);
        return count;
    }

    /**
     * 根据type字段查数据
     * @param collect
     * @return
     */
    @PostMapping("/collect/selectByType")
    public List<Collect> selectByType(@RequestBody Collect collect){
        return collectService.selectByType(collect);
    }
}
