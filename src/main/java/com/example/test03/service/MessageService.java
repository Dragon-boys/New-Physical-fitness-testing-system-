package com.example.test03.service;

import com.example.test03.bean.messages.Messages;

import java.util.List;

public interface MessageService {
    List<Messages> selectById(Messages id);

    List<Messages> selectBatch(List<Long> id);

    int insertBatch(Messages messages);

    int updateAvatar(Messages messages);

    int deleteById(Messages messages);

    int deleteBatchById(Long id);


}
