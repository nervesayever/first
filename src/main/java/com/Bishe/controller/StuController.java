package com.Bishe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.service.StuService;

@RestController
@RequestMapping("/stu")
public class StuController {

	 @Autowired
	 private StuService stuService;
	 
	 @GetMapping("/affirmation")
	 	@ResponseBody
	 public int affirmation(int stuid,String truename,String userid)		//学生认证
	 {
		return stuService.affirmation(stuid,truename,userid);
		 
	 }
	 
	 @GetMapping("/checkconfirm")									//确认是否认证
	 	@ResponseBody
	 public int checkconfirm(String userid,String confirmuserid) {
		 		 
		 return stuService.checkconfirm(userid,confirmuserid);
	 }
	 
	 
	 @GetMapping("/confirm")								//关注	
	 	@ResponseBody
	 public int	confirm(String userid,String confirmuserid) {		
		
		 
		 return stuService.confirm(userid,confirmuserid);	 
	 }
	 
	 @GetMapping("/pass")								//确认关注	
	 	@ResponseBody
	 public int	pass(String userid,String confirmuserid) {		
		
		 
		 return stuService.pass(userid,confirmuserid);	 
	 }
	 
	 @GetMapping("/nopass")								//确认关注	
	 	@ResponseBody
	 public int	nopass(String userid,String confirmuserid) {		
		
		 
		 return stuService.nopass(userid,confirmuserid);	 
	 }
	 
}
