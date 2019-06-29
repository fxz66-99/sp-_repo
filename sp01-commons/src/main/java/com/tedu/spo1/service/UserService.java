package com.tedu.spo1.service;

import com.tedu.spo1.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}

