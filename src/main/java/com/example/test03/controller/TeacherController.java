package com.example.test03.controller;

import com.example.test03.bean.teacher.Teacher;
import com.example.test03.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /**
     * 根据Teacher类中的id 数组形式查询所有数据
     * @param teachers
     * @return
     */
    @PostMapping("/teacher/selectById")
    public List<Teacher> selectById(@RequestBody List<Teacher> teachers){
        List<Teacher> result = teacherService.selectById(teachers);
        return result;
    }

    /**
     * 批量增加数据
     * @param teachers
     * @return
     */
    @PostMapping("/teacher/insertBatch")
    public int count (@RequestBody List<Teacher> teachers){
        return teacherService.insertBatch(teachers);
    }

    /**
     * 根据数组id批量修改字段值 数组 ????????????
     * @param teachers
     * @return
     */

    @PostMapping("/teacher/updateBatchById")
    public int count1 (@RequestBody List<Teacher> teachers){
        int count1 = 0;
        count1 += teacherService.updateBatchById(teachers);
        return count1;
    }

    /**
     * 根据数组id批量删除数据
     * @param id
     * @return
     */
    @PostMapping("/teacher/deleteById")
    public int count2(@RequestBody int[] id){
        return teacherService.deleteById(id);
    }
}
