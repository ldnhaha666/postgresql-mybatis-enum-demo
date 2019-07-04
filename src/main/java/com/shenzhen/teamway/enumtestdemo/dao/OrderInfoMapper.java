package com.shenzhen.teamway.enumtestdemo.dao;

import com.shenzhen.teamway.enumtestdemo.entity.OrderInfo;
import com.shenzhen.teamway.enumtestdemo.enums.OrderInfoEnum;

import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    OrderInfo selectByStatus(OrderInfoEnum orderInfoEnum);

    List<OrderInfo> selectByStatusList(OrderInfoEnum orderInfoEnum);

}