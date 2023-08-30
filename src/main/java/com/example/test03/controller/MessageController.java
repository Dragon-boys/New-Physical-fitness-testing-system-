package com.example.test03.controller;

import com.example.test03.bean.messages.Messages;
import com.example.test03.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 根据id查询所有
     * @param id
     * @return
     */
    @PostMapping("/messages/selectByAll")
    public List<Messages> select(@RequestBody Messages id){
        List<Messages> ms = messageService.selectById(id);
        return ms;
    }

    /**
     * 根据id数组批量查询
     * @param id
     * @return
     */
    @PostMapping("/messages/selectBatch")
    public List<Messages> messageList(@RequestBody List<Long> id){
        return messageService.selectBatch(id);
    }

    /**
     * 新增
     * @param messages
     * @return
     */
    @PostMapping("/messages/insertBatch")
    public int messages(@RequestBody Messages messages){
        return messageService.insertBatch(messages);
    }

    /**
     * 根据id修改头像Avatar信息
     * @param messages
     * @return
     */
    @PostMapping("/messages/updateBatch")
    public int updateBatch(@RequestBody Messages messages){
         return messageService.updateAvatar(messages);
    }

    /**
     * 根据id删除数据
     * @param messages
     * @return
     */
    @PostMapping("/messages/deleteById")
    public int deleteById(@RequestBody Messages messages){
        return messageService.deleteById(messages);
    }

    /**
     * 根据id数组批量删除数据
     * @param id
     * @return
     */
    @PostMapping("/messages/deleteBatchById")
    public int deleteBatchById(@RequestBody List<Long> id){
        int res = 0;
        for (Long i : id){
            res += messageService.deleteBatchById(i);
        }
        return res;
    }

}
