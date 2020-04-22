package com.study.springboot.entityclass.customer;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
* 
*
* @author wangkun
* @date  2020-04-22
*/
@ApiModel(description = "")
@Data
public class Customer  {
        @ApiModelProperty(value = "", name = "customerId", example = "")
        private Integer customerId;
        @ApiModelProperty(value = "", name = "customerName", example = "")
        private String customerName;
        @ApiModelProperty(value = "", name = "customerPhone", example = "")
        private Integer customerPhone;
        @ApiModelProperty(value = "", name = "salt", example = "")
        private String salt;
        @ApiModelProperty(value = "", name = "password", example = "")
        private String password;
        @ApiModelProperty(value = "", name = "createdTime", example = "")
        private Integer createdTime;
}