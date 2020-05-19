package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.BranchMenber;
import com.Bishe.mapper.BranchMapper;
import com.Bishe.mapper.UserMapper;
import com.Bishe.service.BranchService;
import com.Bishe.until.PageModel;

@Service("branchService")
@Transactional(rollbackFor = {Exception.class})
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchMapper branchMapper;

	@Autowired
	UserMapper userMapper;
	
	@Override
	public int joinBranch(int branchid, String userid) {
		// TODO Auto-generated method stub
		return branchMapper.joinBranch(branchid,userid);
	}

	@Override
	public int check(int branchid, String userid) {
		// TODO Auto-generated method stub
		return branchMapper.check(branchid,userid);
	}

	@Override
	public int quit(int branchid, String userid) {
		// TODO Auto-generated method stub
		return branchMapper.quit(branchid,userid);
	}
	
	@Override
	public PageModel<BranchMenber> viewMenber(int parseInt,int branchid) {
		// TODO Auto-generated method stu		
		int rowsPerPage = 3;
		String pname="branchmenber";		
		int startrow = (parseInt - 1) * rowsPerPage;
		int totalRows = userMapper.totalrow(pname,branchid);
		int totalPage = 0;
		if (totalRows % rowsPerPage == 0) {
			totalPage = totalRows / rowsPerPage;
		} else {
			totalPage = totalRows / rowsPerPage + 1;
		}
		PageModel<BranchMenber> pm=new PageModel<BranchMenber>();		
		pm.setTotalPage(totalPage);
		pm.setList(branchMapper.viewMenber(startrow,branchid));		
		return pm;		
	}

	@Override
	public int chairman(int branchid, String userid) {
		// TODO Auto-generated method stub
		return branchMapper.chairman(branchid,userid);
	}
}
