package com.study.springboot.baseclass;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;



@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class BaseModel {
    @ApiModelProperty(value = "起始页", example = "0")
    private Integer start;
    @ApiModelProperty(value = "展示数量", example = "10")
    private Integer length;
    @ApiModelProperty(value = "排序字段(create_time,   trademark_price)", example = "10")
    private String orderField;
    @ApiModelProperty(value = "排序类型(asc, desc)-", example = "10")
    private String orderType;
}
