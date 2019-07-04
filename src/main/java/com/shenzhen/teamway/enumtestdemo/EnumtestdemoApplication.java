package com.shenzhen.teamway.enumtestdemo;

import com.shenzhen.teamway.enumtestdemo.dao.OrderInfoMapper;
import com.shenzhen.teamway.enumtestdemo.entity.OrderInfo;
import com.shenzhen.teamway.enumtestdemo.enums.OrderInfoEnum;
import org.apache.ibatis.annotations.Insert;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = "com.shenzhen.teamway")
public class EnumtestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnumtestdemoApplication.class, args);
	}
}
