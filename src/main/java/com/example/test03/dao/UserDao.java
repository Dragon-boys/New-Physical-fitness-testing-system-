package com.example.test03.dao;

import com.example.test03.bean.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> listUser(User user);
}
