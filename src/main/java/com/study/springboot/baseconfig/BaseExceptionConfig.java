package com.study.springboot.baseconfig;

import com.study.springboot.baseclass.BaseException;
import com.study.springboot.baseclass.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionConfig {

    @ExceptionHandler(value = Exception.class)
    public BaseResponse baseResponseException(Exception e){
        BaseResponse baseResponseException = new BaseResponse(false,e.getMessage());

        if(e instanceof BaseException){
            baseResponseException.setDescription(e.getMessage());
            baseResponseException.setCode(((BaseException) e).getCode());
            return baseResponseException;
        }

        baseResponseException.setDescription("系统出错");
        return baseResponseException;
    }
}
