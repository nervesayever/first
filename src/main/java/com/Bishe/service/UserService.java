package com.Bishe.service;

import com.Bishe.bean.User;

public interface UserService {

	int login(String Username,String password);

	int addUser(User user);

	int deleteUser(String userid);

	int updateUser(User user);
	
}
