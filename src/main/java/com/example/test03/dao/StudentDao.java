package com.example.test03.dao;

import com.example.test03.bean.student.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    List<Student> selectAll(Student student);

    List<Student> selectByAgeAndSex(List<Student> students);

    List<Student>selectConnection();
}
