package com.study.springboot.basesecret;


import com.study.springboot.baseutil.PasswordUtil;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/**
 * action 收到请求解密
 * author wangkun
 * */

@ControllerAdvice
public class DecryptionRequest implements RequestBodyAdvice {

    @Value("${secret.open}")
    private Boolean secretOpen;
    @Value("${secret.key}")
    private String secretKey;

    @Override
    public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        return new HttpInputMessage() {
            @SneakyThrows
            @Override
            public InputStream getBody()  {
                String content = IOUtils.toString(httpInputMessage.getBody());
                String path=methodParameter.getMethod().getName();
                ApiSecret apiSecret = new ApiSecret();
                if (ArrayUtils.contains(apiSecret.getNoDecryption(), path)) {
                    return new ByteArrayInputStream(content.getBytes());
                }
                if (secretOpen) {
                    return new ByteArrayInputStream(PasswordUtil.desEncrypt(content, secretKey, secretKey).getBytes());
                } else {
                    return new ByteArrayInputStream(content.getBytes());
                }
            }

            @Override
            public HttpHeaders getHeaders() {
                return httpInputMessage.getHeaders();
            }
        };
    }

    @Override
    public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }
}
