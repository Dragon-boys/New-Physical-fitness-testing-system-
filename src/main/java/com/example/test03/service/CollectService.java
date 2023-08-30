package com.example.test03.service;

import com.example.test03.bean.collect.Collect;

import java.util.List;

public interface CollectService {
    List<Collect> selectAll(List<Long> id);
    int insertBatch(List<Collect> collects);

    List<Collect> selectByType(Collect collect);
}
