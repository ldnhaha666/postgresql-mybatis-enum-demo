package com.shenzhen.teamway.enumtestdemo.enums;

import com.shenzhen.teamway.enumtestdemo.entity.OrderInfo;

/**
 * @author LinD
 * @Classname OrderInfoEnum
 * @Description TODO
 * @date 2019/7/2 17:24
 */
public enum OrderInfoEnum {

	a("创建"), b("支付中"), c("支付成功"), d("支付失败"),e("取消订单");

	private String type;

	OrderInfoEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static OrderInfoEnum getOrderInfoEnum(String type) {
		if (type.equals("创建")) {
			return a;
		} else if (type.equals("支付中")) {
			return b;
		} else if (type.equals("支付成功")) {
			return c;
		} else if (type.equals("支付失败")) {
			return d;
		} else if (type.equals("取消订单")) {
			return e;
		}
		return null;
	}
}
