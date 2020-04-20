package com.study.springboot.entityclass.student;

import java.util.List;
import com.study.springboot.entityclass.student.Student;

/**
* (Student)表服务接口
*
* @author wangkun
* @date  2020-04-20
*/
public interface StudentService {

    /**
    * 查询多条数据
    *
    * @param student 查询参数
    * @return 对象列表
    */
    List<Student> pages(Student student);

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    List<Student> getAll();

}