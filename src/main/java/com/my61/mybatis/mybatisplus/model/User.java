package com.my61.mybatis.mybatisplus.model;

import com.my61.mybatis.mybatisplus.model.enums.UserSexEnum;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@ToString
public class User implements Serializable{


    private int Id;
    private String Name;
    private int Age; 
    
    private UserSexEnum Sex;
    private BigDecimal price;



}