package com.example.test03.service;

import com.example.test03.bean.teacher.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> selectById(List<Teacher> teachers);

    int insertBatch(List<Teacher> teachers);

    int updateBatchById(List<Teacher> teachers);

    int deleteById(int[] id);
}
