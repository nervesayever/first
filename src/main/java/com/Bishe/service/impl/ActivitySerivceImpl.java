package com.Bishe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.Activity;
import com.Bishe.mapper.ActivityMapper;
import com.Bishe.mapper.UserMapper;
import com.Bishe.service.ActivityService;
import com.Bishe.until.PageModel;

@Service("activityService")
@Transactional(rollbackFor = {Exception.class})
public class ActivitySerivceImpl implements ActivityService{

	@Autowired
	ActivityMapper actMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public int addActivity(Activity act) {
		
		return actMapper.addActivity(act);
	}

	@Override
	public int joinActivity(int actid, String userid) {
		// TODO Auto-generated method stub
		if(actMapper.joinActivity(actid,userid)==1) {
			actMapper.addnum(actid);
			return 1;
		}
		return 0;
	}

	@Override
	public int checkActivity(int actid, String userid) {
		// TODO Auto-generated method stub
		return actMapper.checkActivity(actid,userid);
	}

	@Override
	public int cancelActivity(int actid, String userid) {
		// TODO Auto-generated method stub
		if(actMapper.cancelActivity(actid,userid)==1) {
			
			actMapper.reducenum(actid);
			return 1;
			}
		return 0;
	}

	@Override
	public int deleteActivity(int actid) {
		// TODO Auto-generated method stub
		return actMapper.deleteActivity(actid);
	}

	@Override
	public List<Activity> viewActivity(int branchid) {

		List<Activity> pm;		
		pm=actMapper.viewActivity(branchid);		
		return pm;		
	}
	
}
