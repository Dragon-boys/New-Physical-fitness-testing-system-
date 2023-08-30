package com.example.test03.controller;

import com.example.test03.bean.user.User;
import com.example.test03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/selectById")
    public List<User> selectById(@RequestBody User user){
        List<User> users = userService.listUser(user);
        return users;
    }
}
