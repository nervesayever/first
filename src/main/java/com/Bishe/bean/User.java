package com.Bishe.bean;

public class User {

	private int telnum;
	public int getTelnum() {
		return telnum;
	}
	public void setTelnum(int telnum) {
		this.telnum = telnum;
	}
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private int age;
	private String adress;
	private int stuid;
	private String userid;
	private String password;

	private int actlevel;
	public int getActlevel() {
		return actlevel;
	}
	public void setActlevel(int actlevel) {
		this.actlevel = actlevel;
	}
	
}
