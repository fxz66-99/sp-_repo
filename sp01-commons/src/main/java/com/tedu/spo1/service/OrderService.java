package com.tedu.spo1.service;


import com.tedu.spo1.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}