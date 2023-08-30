package com.example.test03.service.impl;

import com.example.test03.bean.collect.Collect;
import com.example.test03.dao.CollectDao;
import com.example.test03.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectImpl implements CollectService {
    @Autowired
    private CollectDao collectDao;

    @Override
    public List<Collect> selectAll(List<Long> id) {
        return collectDao.selectAll(id);
    }

    @Override
    public int insertBatch(List<Collect> collects) {
        int count = 0;
        count  += collectDao.insertBatch(collects);
        return count;
    }

    @Override
    public List<Collect> selectByType(Collect collect) {
        return collectDao.selectByType(collect);
    }
}
