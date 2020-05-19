package com.Bishe.service;

import java.util.List;

import com.Bishe.bean.Activity;

public interface ActivityService {

	public int addActivity(Activity act);

	public int joinActivity(int actid, String userid);

	public int checkActivity(int actid, String userid);

	public int cancelActivity(int actid, String userid);

	public int deleteActivity(int actid);

	List<Activity> viewActivity(int branchid);
}
