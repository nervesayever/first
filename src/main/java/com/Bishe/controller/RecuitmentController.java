package com.Bishe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.Recuitment;
import com.Bishe.service.RecuitService;

@RestController
@RequestMapping("/recuit")
public class RecuitmentController {

	 @Autowired
	 private RecuitService recuitService;
	
	 @GetMapping("/addrecuit")
	    @ResponseBody
	 public int addrecuit(@RequestBody Recuitment recuit){
	
		return (recuitService.addrecuit(recuit));		
	 }
	 
	 @GetMapping("/deleterecuit")
	    @ResponseBody
	 public int deleterecuit(String recuitid){
	
		return (recuitService.deleterecuit(recuitid));		
	 }
}
