package com.Bishe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Bishe.bean.Activity;

@Mapper
public interface ActivityMapper {

	
	public int addActivity(Activity act);
	
	public int deleteActivity(int actid);
	
	public List<Activity> viewActivity(int branchid);
	
	public int joinActivity(int actid, String userid);
	
	public int checkActivity(int actid, String userid);
	
	public int cancelActivity(int actid, String userid);
	
	public int totalrow(String pname, int branchid);
	
	public void addnum(int actid);
	
	public void reducenum(int actid);
	
}
