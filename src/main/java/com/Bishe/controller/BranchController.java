package com.Bishe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.BranchMenber;
import com.Bishe.service.BranchService;
import com.Bishe.until.PageModel;
import com.alibaba.fastjson.JSON;



@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	 @GetMapping("/viewMenber" )
	    @ResponseBody
	 public void viewMenber(String currentPage,String branchid,HttpServletResponse response) {
		 
		 System.out.println(Integer.parseInt(currentPage));
		 PageModel<BranchMenber> pm = branchService.viewMenber(Integer.parseInt(currentPage),Integer.parseInt(branchid));
		 response.setContentType("application/json;charset=GBK");
		 PrintWriter out = null;
		  
			try {
				out =response.getWriter();
				 out.write(JSON.toJSONString(pm));
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
	 }
	
	@GetMapping("/check" )
	@ResponseBody
	public int check(int branchid,String userid) {
		return branchService.check(branchid,userid);	
	}
	
	@GetMapping("/chairman" )
	@ResponseBody
	public int chairman(int branchid,String userid) {
		return branchService.chairman(branchid,userid);	
	}
	@GetMapping("/quit" )
	@ResponseBody
	public int quit(int branchid,String userid) {
	
		return branchService.quit(branchid,userid);	
	}
	
	@GetMapping("/joinBranch" )
		@ResponseBody
	public int joinBranch(int branchid,String userid) {
		
		return branchService.joinBranch(branchid,userid);	
	}
}
