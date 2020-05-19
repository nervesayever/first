package com.Bishe.service;

import com.Bishe.bean.BranchMenber;
import com.Bishe.until.PageModel;

public interface BranchService {

	int joinBranch(int branchid, String userid);

	int check(int branchid, String userid);

	int quit(int branchid, String userid);
	
	PageModel<BranchMenber> viewMenber(int currentPage,int branchid);

	int chairman(int branchid, String userid);

}
