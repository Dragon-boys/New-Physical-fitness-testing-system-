package com.example.test03.controller;

import com.example.test03.bean.testReport.BaoGao;
import com.example.test03.service.BaoGaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BaoGaoController {

    @Autowired
    private BaoGaoService baoGaoService;

    @PostMapping("/baogao/selectBatch")
    public List<BaoGao> select(@RequestBody BaoGao baoGao){
        List<BaoGao> res = baoGaoService.selectBaoGaoService(baoGao);
        return res;
    }

    @PostMapping("/baogao/selectById")
    public List<BaoGao> seleBySno(@RequestBody BaoGao baoGao){
        List<BaoGao> res1 = baoGaoService.selectById(baoGao);
        return res1;
    }

    @PostMapping("/baogao/batchInsert")
    public void batchInsert(@RequestBody List<BaoGao> entities){
        List<BaoGao> entities1 = new ArrayList<>();
        baoGaoService.batchInsert(entities1);
    }

}
