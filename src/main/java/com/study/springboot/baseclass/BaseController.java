package com.study.springboot.baseclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;

//    /*每个controller就会用这个方法，每个请求都在这里验证*/
//    @ModelAttribute
//    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
//        this.request = request;
//        this.response = response;
////        processAuth(request);
//    }

}
