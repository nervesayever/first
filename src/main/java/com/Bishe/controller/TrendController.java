package com.Bishe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.BranchMenber;
import com.Bishe.bean.Trend;
import com.Bishe.service.TrendService;
import com.Bishe.until.TrendModel;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/trend")
public class TrendController {

	 @Autowired
	 private TrendService trendService;
	 
	 @GetMapping("/addTrend")
	 public int addTrend(@RequestBody Trend trend){

			return trendService.addTrend(trend);
		 }
	 @GetMapping("/deleteTrend")
	 public int deleteTrend(String trendid){

			return trendService.deleteTrend(trendid);
		 }
	 @GetMapping("/viewTrend")
	 public  void viewTrend(HttpServletResponse response) {
		 
		 TrendModel pm = trendService.viewTrend();
		 response.setContentType("application/json;charset=GBK");
		 PrintWriter out = null;
		  
			try {
				out =response.getWriter();
				 out.write(JSON.toJSONString(pm));
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
	 }
}
