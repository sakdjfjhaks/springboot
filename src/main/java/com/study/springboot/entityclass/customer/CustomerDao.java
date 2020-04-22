package com.study.springboot.entityclass.customer;

import  com.study.springboot.entityclass.customer.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Customer)表数据交互类
 * @author wangkun
 * @date  $2020-04-22
 */
@Mapper
public interface CustomerDao {

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
   * @return 影响行数
   */
   int add(Customer customer);

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
   * @return 影响行数
   */
   int update(Customer customer);

   /**
   * 通过主键删除数据
   *
   * @param customerId 主键
   * @return 影响行数
   */
   int deleteById(Integer customerId);
}
