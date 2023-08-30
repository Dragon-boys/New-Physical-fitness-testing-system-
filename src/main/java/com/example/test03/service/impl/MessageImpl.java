package com.example.test03.service.impl;

import com.example.test03.bean.messages.Messages;
import com.example.test03.dao.MessageDao;
import com.example.test03.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageImpl  implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Messages> selectById(Messages id) {
        return messageDao.selectById(id);
    }

    @Override
    public List<Messages> selectBatch(List<Long> id) {
        List<Messages> messages = messageDao.selectBatch(id);
        return messages;
    }

    @Override
    @Transactional
    public int insertBatch(Messages messages) {
        return messageDao.insertBatch(messages);
    }

    @Override
    public int updateAvatar(Messages messages) {
        return messageDao.updateAvatar(messages);
    }

    @Override
    public int deleteById(Messages messages) {
        return messageDao.deleteById(messages);
    }

    @Override
    public int deleteBatchById(Long id) {
        return messageDao.deleteBatchById(id);
    }

}
