package com.study.springboot.baseutil;

public class PasswordUtilTest {
    public static void main(String[] args) throws Exception {
        String key = "1234567891234567";
        String content = "DJQHZjt6LTvQGBYj4bLl/AXwX/J5Ts+JN7VIGM9cgN0GK7bk0XjIVSZHPNHb2TPAFb2Ct2wqhj0D/bi5C8aj1m3nNw4lm6x6SxhO6MAIHx75YG9SX/NiUCRLfXZ+XR2yzmwPdo2IlFz5HYIfwt65ptkc8a38pIMVFMc4jV2N1C1cg+TJwG3fiv1Kjb5jXYY4JMqD12P62i6nCKJOq+BtYae3gNUpF5cJqJtP4me03qU=";
        String contentKey = PasswordUtil.encrypt(content,key,key);
        System.out.println(contentKey);

        String content1 = PasswordUtil.desEncrypt(content,key,key);
        System.out.println(content1);


    }
}
