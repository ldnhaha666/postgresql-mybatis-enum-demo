package com.shenzhen.teamway.enumtestdemo.entity;

import com.shenzhen.teamway.enumtestdemo.enums.OrderInfoEnum;
import lombok.Data;

@Data
public class OrderInfo {

    private Integer id;

    private OrderInfoEnum status;

}