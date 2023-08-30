package com.example.test03.dao;

import com.example.test03.bean.teacher.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherDao {
    List<Teacher> selectById(List<Teacher> teachers);

    int insertBatch(List<Teacher> teachers);

    int updateBatchById(List<Teacher> teachers);

    int deleteById(int[] id);
}
