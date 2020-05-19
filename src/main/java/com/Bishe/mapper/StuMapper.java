package com.Bishe.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper {

	int check(int stuid, String truename);

	void affirmationstu(int stuid, String userid);

	void affirmationuser(int stuid, String userid);

	int checkconfirm(String userid, String confirmuserid);

	int confirm(String userid, String confirmuserid);

	

}
