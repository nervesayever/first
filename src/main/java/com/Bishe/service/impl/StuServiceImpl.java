package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.mapper.StuMapper;
import com.Bishe.mapper.UserMapper;
import com.Bishe.service.StuService;

@Service("stuService")
@Transactional(rollbackFor = {Exception.class})
public class StuServiceImpl implements StuService{
	
	@Autowired
	StuMapper stuMapper;
	@Autowired
	UserMapper userMapper;

	@Override
	public int affirmation(int stuid, String truename, String userid) {
		// TODO Auto-generated method stub
	 if(stuMapper.check(stuid,truename)==1){
		 stuMapper.affirmationstu(stuid,userid);
		 stuMapper.affirmationuser(stuid, userid);
		 return 1;
	 }
	 else return 0;
	 	  
	}
	@Override
	public int checkconfirm(String userid, String confirmuserid) {
		// TODO Auto-generated method stub
		return stuMapper.checkconfirm(userid,confirmuserid);
	}

	@Override
	public int confirm(String userid, String confirmuserid) {
		// TODO Auto-generated method stub
		if(stuMapper.confirm(userid,confirmuserid)==1) {
		
			userMapper.addactlevel(confirmuserid);
			return 1;
			}
		else return 0;
		
	}
	@Override
	public int pass(String userid, String confirmuserid) {
		// TODO Auto-generated method stub
		return userMapper.pass(userid,confirmuserid);
	}
	@Override
	public int nopass(String userid, String confirmuserid) {
		// TODO Auto-generated method stub
		return userMapper.nopass(userid,confirmuserid);
	}
}
