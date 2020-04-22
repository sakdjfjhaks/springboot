package com.study.springboot.entityclass.customer;

import com.github.pagehelper.Page;
import com.study.springboot.entityclass.customer.Customer;
import com.study.springboot.entityclass.customer.CustomerService;

import com.github.pagehelper.PageHelper;
import com.study.springboot.baseclass.BaseResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;
/**
*
* 
* @author wangkun
* @date  2020-04-22
*/
@Controller
@RequestMapping("/customer")
@Api(value = "", tags = "操作接口")
public class CustomerController {

    @Resource
    private CustomerService service;

    @ApiOperation(value = "分页", notes = "分页查询")
    @PostMapping(value = "/pages")
    public BaseResponse pages(@RequestBody Customer customer) {
        PageHelper.startPage(customer .getStart(), customer .getLength());
        List<Customer> list = service.pages(customer);
        return new BaseResponse(true, "获取成功", list, ((Page) list).getTotal());
    }

    @ApiOperation(value = "获取所有", notes = "获取所有")
    @PostMapping(value = "/getAll")
    public BaseResponse getAll() {
        List<Customer> list = this.service.getAll();
        return new BaseResponse(true, "获取成功", list);
    }

    @ApiOperation(value = "添加", notes = "添加")
    @PostMapping("/add")
    public BaseResponse add(@RequestBody Customer customer) {
        Customer newCustomer = service.add(customer);
        return new BaseResponse(true, "添加成功", newCustomer);
    }


    @ApiOperation(value = "详情", notes = "详情")
    @PostMapping("/detail")
    public BaseResponse detail(@RequestBody Customer customer) {
        Customer newCustomer = service.getById(customer.getcustomerId());
        if (newCustomer != null) {
            return new BaseResponse(true, "查询成功", newCustomer);
        } else {
            return new BaseResponse(false, "没有找到");
        }
    }

    @ApiOperation(value = "修改", notes = "用户修改")
    @PostMapping("/update")
    public BaseResponse update(@RequestBody Customer customer) {
        Customer newCustomer = service.update(customer);
        return new BaseResponse(true, "修改成功", newCustomer);
    }

    @ApiOperation(value = "删除", notes = "删除")
    @PostMapping("/delete")
    public BaseResponse delete(@RequestBody Customer customer) {
        service.deleteById(customer.getcustomerId());
        return new BaseResponse(true, "删除成功");
    }

}