package com.Bishe.service;

public interface StuService {

	int affirmation(int stuid,String truename,String confirmuserid);

	int checkconfirm(String userid, String confirmuserid);

	int confirm(String userid, String confirmuserid);

	int pass(String userid, String confirmuserid);

	int nopass(String userid, String confirmuserid);

}
