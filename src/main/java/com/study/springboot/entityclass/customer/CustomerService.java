package com.study.springboot.entityclass.customer;

import java.util.List;
import com.study.springboot.entityclass.customer.Customer;

/**
* (Customer)表服务接口
*
* @author wangkun
* @date  2020-04-22
*/
public interface CustomerService {

    /**
    * 查询多条数据
    *
    * @param customer 查询参数
    * @return 对象列表
    */
    List<Customer> pages(Customer customer);

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    List<Customer> getAll();

    /**
    * 新增数据
    *
    * @param customer 实例对象
    * @return 实例对象
    */
    Customer add(Customer customer);

    /**
    * 通过ID查询单条数据
    *
    * @param customerId 主键
    * @return 实例对象
    */
    Customer getById(Integer customerId);


    /**
    * 修改数据
    *
    * @param customer 实例对象
    * @return 实例对象
    */
    Customer update(Customer customer);

    /**
    * 通过主键删除数据
    *
    * @param customerId 主键
    * @return 是否成功
    */
    boolean deleteById(Integer customerId);

}