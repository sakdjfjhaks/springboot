package com.study.springboot.entityclass.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
* (Student)表服务实现类
*
* @author wangkun
* @date  2020-04-20
*/
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao dao;

    /**
    * 查询多条数据
    *
    * @param student 查询参数
    * @return 对象列表
    */
    @Override
    public List<Student> pages(Student student){
        return this.dao.pages(student);
    }

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    @Override
    public List<Student> getAll(){
        return this.dao.getAll();
    }

}