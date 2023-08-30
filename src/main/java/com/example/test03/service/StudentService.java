package com.example.test03.service;

import com.example.test03.bean.student.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll(Student student);

    List<Student> selectByAgeAndSex(List<Student> students);

    List<Student> selectConnection();
}
