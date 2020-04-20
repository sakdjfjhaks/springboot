package com.study.springboot.entityclass.student;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.springboot.baseclass.BaseResponse;
import com.study.springboot.entityclass.student.Student;
import com.study.springboot.entityclass.student.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
*
* 
* @author wangkun
* @date  2020-04-20
*/
@RestController
@RequestMapping("/student")
@Api(value = "", tags = "操作接口")
public class StudentController {

    @Resource
    private StudentService service;

    @ApiOperation(value = "分页", notes = "分页查询")
    @PostMapping(value = "/pages")
    public BaseResponse pages(@RequestBody Student student) {
        PageHelper.startPage(student.getStart(), student.getLength());
        List<Student> list = service.pages(student);
        return new BaseResponse(true, "获取成功", list, ((Page) list).getTotal());
    }
    @ApiOperation(value = "获取所有", notes = "获取所有")
    @PostMapping(value = "/getAll")
    public BaseResponse getAll() {
        List<Student> list = this.service.getAll();
        return new BaseResponse(true, "获取成功", list);
    }

}