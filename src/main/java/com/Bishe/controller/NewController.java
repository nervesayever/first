package com.Bishe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.New;
import com.Bishe.service.NewService;

@RestController
@RequestMapping("/new")
public class NewController {

	 @Autowired
	 private NewService newservice;
	 
	 @GetMapping("/addNew")
	    @ResponseBody
	 public int addNew(@RequestBody New news){

		return newservice.addNew(news);
	 }
	 
	 @GetMapping("/deleteNew")
	    @ResponseBody
	 public int deleteNew(String newsid){

		return newservice.deleteNew(newsid);
	 }
}
