package com.example.test03.service.impl;


import com.example.test03.bean.testReport.BaoGao;
import com.example.test03.dao.BaoGaoDao;
import com.example.test03.service.BaoGaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaoGaoServiceImpl implements BaoGaoService {

    @Autowired
    private BaoGaoDao baoGaoDao;

    @Override
    public List<BaoGao> selectBaoGaoService(BaoGao baoGao) {
        List<BaoGao> select = baoGaoDao.selectBaoGao(baoGao);
        return select;
    }

    @Override
    public List<BaoGao> selectById(BaoGao baoGao) {
        List<BaoGao> select1 = baoGaoDao.selectById(baoGao);
        return select1;
    }

    @Override
    public void batchInsert(List<BaoGao> entities1) {
        baoGaoDao.batchInsert(entities1);
    }

}
