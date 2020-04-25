package com.study.springboot.baseconstant;

public enum BaseConstantEnum {
    DELETE_FAILD("删除失败",123);

    private String message;
    private Integer code;
    BaseConstantEnum(String 删除失败, int i) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
