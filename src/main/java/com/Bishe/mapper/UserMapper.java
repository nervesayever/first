package com.Bishe.mapper;



import org.apache.ibatis.annotations.Mapper;


import com.Bishe.bean.User;

@Mapper
public interface UserMapper {
	
	public int login(String username,String password);
	
	public int totalrow(String pname,int branchid);
	
	public int addUser(User user);

	public int deleteUser(String userid);

	public int updateUser(User user);

	public void addactlevel(String confirmuserid);

	public int pass(String userid, String confirmuserid);

	public int nopass(String userid, String confirmuserid);
}
