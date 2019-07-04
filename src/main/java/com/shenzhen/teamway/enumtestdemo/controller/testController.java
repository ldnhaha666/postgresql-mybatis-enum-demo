package com.shenzhen.teamway.enumtestdemo.controller;

import com.shenzhen.teamway.enumtestdemo.dao.OrderInfoMapper;
import com.shenzhen.teamway.enumtestdemo.entity.OrderInfo;
import com.shenzhen.teamway.enumtestdemo.enums.OrderInfoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinD
 * @Classname testController
 * @Description TODO
 * @date 2019/7/4 8:18
 */
@RestController
public class testController {

	@Autowired
	private OrderInfoMapper orderInfoMapper;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public void insertTest(){

		List<OrderInfo> orderInfoList = new ArrayList<>();

		OrderInfo orderInfo = new OrderInfo();
		OrderInfo orderInfo1 = new OrderInfo();
		OrderInfo orderInfo2 = new OrderInfo();
		OrderInfo orderInfo3 = new OrderInfo();
		OrderInfo orderInfo4 = new OrderInfo();

		orderInfo.setStatus(OrderInfoEnum.d);
		orderInfo1.setStatus(OrderInfoEnum.e);
		orderInfo2.setStatus(OrderInfoEnum.a);
		orderInfo3.setStatus(OrderInfoEnum.b);
		orderInfo4.setStatus(OrderInfoEnum.c);

		orderInfoList.add(orderInfo);
		orderInfoList.add(orderInfo1);
		orderInfoList.add(orderInfo2);
		orderInfoList.add(orderInfo3);
		orderInfoList.add(orderInfo4);

		System.out.println(orderInfoList);

		orderInfoMapper.insert(orderInfo);
		orderInfoMapper.insert(orderInfo1);
		orderInfoMapper.insert(orderInfo2);
		orderInfoMapper.insert(orderInfo3);
		orderInfoMapper.insert(orderInfo4);

	}

	@RequestMapping(value = "/select")
	@ResponseBody
	public String selectTest(){

		List<OrderInfo> orderInfos = orderInfoMapper.selectByStatusList(OrderInfoEnum.b);

		System.out.println(orderInfos);

		return orderInfos.toString();

	}

}
