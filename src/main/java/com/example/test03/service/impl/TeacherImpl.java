package com.example.test03.service.impl;

import com.example.test03.bean.teacher.Teacher;
import com.example.test03.dao.TeacherDao;
import com.example.test03.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> selectById(List<Teacher> teachers) {
        List<Teacher> teachers1 = teacherDao.selectById(teachers);
        return teachers1;
    }

    @Override
    public int insertBatch(List<Teacher> teachers) {
        return teacherDao.insertBatch(teachers);
    }

    @Override
    public int updateBatchById(List<Teacher> teachers) {
        int count = 0;
        count +=  teacherDao.updateBatchById(teachers);
        return count;
    }

    @Override
    public int deleteById(int[] id) {
        return teacherDao.deleteById(id);
    }
}
