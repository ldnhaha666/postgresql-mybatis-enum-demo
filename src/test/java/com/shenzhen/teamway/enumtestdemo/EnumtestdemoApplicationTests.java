package com.shenzhen.teamway.enumtestdemo;

import com.shenzhen.teamway.enumtestdemo.dao.OrderInfoMapper;
import com.shenzhen.teamway.enumtestdemo.entity.OrderInfo;
import com.shenzhen.teamway.enumtestdemo.enums.OrderInfoEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnumtestdemoApplicationTests {

	//private OrderInfoMapper orderInfoMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void selectTest(){

		OrderInfoMapper orderInfoMapper = null;

		OrderInfo orderInfo = new OrderInfo();

		OrderInfoEnum orderInfoEnum = OrderInfoEnum.e;

		orderInfo = orderInfoMapper.selectByStatus(orderInfoEnum);

		System.out.println(orderInfo);

	}

	@Test
	public void insertTest(){

		OrderInfoMapper orderInfoMapper = null;

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

}
