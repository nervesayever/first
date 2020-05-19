package com.Bishe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Bishe.bean.BranchMenber;

@Mapper
public interface BranchMapper {

	int joinBranch(int branchid, String userid);

	int check(int branchid, String userid);

	int quit(int branchid, String userid);
	
	public List<BranchMenber> viewMenber(int startrow,int branchid);

	int chairman(int branchid, String userid);
	
	
}
