package com.example.test03.dao;

import com.example.test03.bean.messages.Messages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageDao {
    List<Messages> selectById(Messages id);

    List<Messages> selectBatch(List<Long> id);

    int insertBatch(Messages messages);

    int updateAvatar(Messages messages);

    int deleteById(Messages messages);

    int deleteBatchById(Long id);

}
