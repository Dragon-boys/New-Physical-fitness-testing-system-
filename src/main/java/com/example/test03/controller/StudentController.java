package com.example.test03.controller;

import com.example.test03.bean.student.Student;
import com.example.test03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 查询年龄和性别的数据
     * @param student
     * @return
     */
    @PostMapping("/student/selectAll")
    public List<Student> selectAll(@RequestBody Student student){
        return studentService.selectAll(student);
    }

    /**
     * 查询性别年龄关联数据
     * @param students
     * @return
     */
    @PostMapping("/student/selectByAgeAndSex")
    public List<Student> selectByAgeAndSex(@RequestBody List<Student> students){
        return studentService.selectByAgeAndSex(students);
    }

    /**
     * 双表条件查询
     * @return
     */
    @PostMapping("/student/selectConnection")
    public List<Student> selectConnection(){
        return studentService.selectConnection();
    }
}
