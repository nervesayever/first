package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.User;
import com.Bishe.mapper.UserMapper;
import com.Bishe.service.UserService;

@Service("userService")
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public int login(String username,String password) {
		
		return userMapper.login(username, password);
	}

	@Override
	public int addUser(User user) {
			
		return userMapper.addUser(user);
	}

	@Override
	public int deleteUser(String userid) {
		
		return userMapper.deleteUser(userid);
	}

	@Override
	public int updateUser(User user) {
		
		return userMapper.updateUser(user);
	}
	
	
	
	

}
