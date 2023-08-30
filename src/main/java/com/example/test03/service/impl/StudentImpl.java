package com.example.test03.service.impl;

import com.example.test03.bean.student.Student;
import com.example.test03.dao.StudentDao;
import com.example.test03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll(Student student) {
        return studentDao.selectAll(student);
    }

    @Override
    public List<Student> selectByAgeAndSex(List<Student> students) {
        List<Student> select  = studentDao.selectByAgeAndSex(students);
        return select;
    }

    @Override
    public List<Student> selectConnection() {
        return studentDao.selectConnection();
    }
}
