package com.Bishe.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bishe.bean.User;
import com.Bishe.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController  {
	
	 @Autowired
	 private UserService userService;
	 
	 @GetMapping("/login")
	 public int login(String username,String password,HttpServletResponse response){
	
		 System.out.println(username+password);
		 response.setHeader("Access-Control-Allow-Origin", "*");
		 response.setHeader("Cache-Control","no-cache"); 
		return (userService.login(username, password));		
	 }
	 @GetMapping("/addUser")
	 	@ResponseBody
	 public int addUser(@RequestBody User user){
				 
		 return userService.addUser(user);
		 
	 }
	 
	 @GetMapping("/UpdateUser")
	 	@ResponseBody
	 public int UpdateUser(@RequestBody User user) {
		 
		 return userService.updateUser(user);
	 }
 
	 
	 @GetMapping("/deleteUser")
	 	@ResponseBody
	 public int deleteUser(String userid){
		 
		 return userService.deleteUser(userid);
	 }
	
}
