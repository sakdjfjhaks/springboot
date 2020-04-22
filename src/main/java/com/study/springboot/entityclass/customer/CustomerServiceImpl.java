package com.study.springboot.entityclass.customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
* (Customer)表服务实现类
*
* @author wangkun
* @date  2020-04-22
*/
@Service
public class CustomerServiceImpl implements CustomerService{

    @Resource
    private CustomerDao dao;

    /**
    * 查询多条数据
    *
    * @param customer 查询参数
    * @return 对象列表
    */
    @Override
    public List<Customer> pages(Customer customer){
        return this.dao.pages(customer);
    }

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    @Override
    public List<Customer> getAll(){
        return this.dao.getAll();
    }

    /**
    * 新增数据
    *
    * @param customer 实例对象
    * @return 实例对象
    */
    @Override
    public Customer add(Customer customer){
        this.dao.add(customer);
        return  this.getById(customer.getCustomerId());
    }


    /**
    * 通过ID查询单条数据
    *
    * @param customerId 主键
    * @return 实例对象
    */
    @Override
    public Customer getById(Long customerId){
        return this.dao.getById(customerId);
    }


    /**
    * 修改数据
    *
    * @param customer 实例对象
    * @return 实例对象
    */
    @Override
    public Customer update(Customer customer){
        this.dao.update(customer);
        return this.getById(customer.getCustomerId());
    }

    /**
    * 通过主键删除数据
    *
    * @param customerId 主键
    * @return 是否成功
    */
    @Override
    public boolean deleteById(Long customerId){
        return this.dao.deleteById(customerId)>0;
    }

}