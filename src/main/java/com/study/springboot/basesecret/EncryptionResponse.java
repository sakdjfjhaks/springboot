package com.study.springboot.basesecret;

import cn.hutool.core.util.ArrayUtil;
import com.alibaba.fastjson.JSON;
import com.study.springboot.baseutil.PasswordUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * action 回复请求加密
 * author wangkun
 * */

@ControllerAdvice
public class EncryptionResponse implements ResponseBodyAdvice {

    @Value("${secret.open}")
    private Boolean secretOpen;
    @Value("${secret.key}")
    private String secretKey;

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object object, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        String apiPath = serverHttpRequest.getURI().getPath();
        ApiSecret apiSecret = new ApiSecret();
        if(secretOpen && !ArrayUtil.contains(apiSecret.getNoEncrytion(),apiPath)){
            return PasswordUtil.encrypt(JSON.toJSONString(object),secretKey,secretKey);
        }
        return object;
    }
}
