package com.example.test03.dao;

import com.example.test03.bean.collect.Collect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.logging.log4j.message.Message;

import java.util.List;

@Mapper
public interface CollectDao {
    List<Collect> selectAll(List<Long> id);

    int insertBatch(List<Collect> collect);

    List<Collect> selectByType(Collect collect);
}
