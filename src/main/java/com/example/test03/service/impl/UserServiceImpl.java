package com.example.test03.service.impl;

import com.example.test03.bean.user.User;
import com.example.test03.dao.UserDao;
import com.example.test03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserDao userDao;

    @Override
    public List<User> listUser(User user) {
        List<User> listuser = userDao.listUser(user);
        return listuser;
    }


}
