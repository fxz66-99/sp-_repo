package com.tedu.spo1.service;

import java.util.List;

import com.tedu.spo1.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
