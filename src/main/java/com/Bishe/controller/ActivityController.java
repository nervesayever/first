package com.Bishe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.Activity;
import com.Bishe.service.ActivityService;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/act")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	
	 @GetMapping("/viewActivity" )				//浏览活动
	    @ResponseBody
	 public void viewMenber(String currentPage,String branchid,HttpServletResponse response) {
		 
		
		 List<Activity> pm = activityService.viewActivity(Integer.parseInt(branchid));
		 response.setContentType("application/json;charset=GBK");
		 PrintWriter out = null;
		  
			try {
				out =response.getWriter();
				 out.write(JSON.toJSONString(pm));
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
	 }
	
	@GetMapping("/addActivity")								//添加活动
		@ResponseBody
	public int addActivity(@RequestBody Activity activity) {
		return activityService.addActivity(activity);
	
	}
	
	@GetMapping("/checkActivity")							//是否已参加活动
		@ResponseBody
	public int checkActivity(int actid,String userid) {

		return activityService.checkActivity(actid,userid);
	}
	
	@GetMapping("/joinActivity")							//参加活动
		@ResponseBody
	public int joinActivity(int actid,String userid) {
	
		return activityService.joinActivity(actid,userid);
	}
	
	@GetMapping("/cancelActivity")							//取消参加
		@ResponseBody
	public int cancelActivity(int actid,String userid) {

		return activityService.cancelActivity(actid,userid);
	}
	
	@GetMapping("/deleteActivity")							//删除活动
		@ResponseBody
		public int deleteActivity(int actid,String userid) {

		return activityService.deleteActivity(actid);
	}
	
	
}

