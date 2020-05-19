package com.Bishe.bean;

import java.sql.Date;

public class Activity {
	
	private int actid;
	private int categoryid;

	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	private String actpicurl;
	public String getActpicurl() {
		return actpicurl;
	}
	public void setActpicurl(String actpicurl) {
		this.actpicurl = actpicurl;
	}
	public int getActid() {
		return actid;
	}
	public void setActid(int actid) {
		this.actid = actid;
	}
	private String acttitle;
	private String actcontent;
	private Date acttime;
	private int belong; 
	public int getBelong() {
		return belong;
	}
	public void setBelong(int belong) {
		this.belong = belong;
	}
	public String getActtitle() {
		return acttitle;
	}
	public void setActtitle(String acttitle) {
		this.acttitle = acttitle;
	}
	public String getActcontent() {
		return actcontent;
	}
	public void setActcontent(String actcontent) {
		this.actcontent = actcontent;
	}
	public Date getActtime() {
		return acttime;
	}
	public void setActtime(Date acttime) {
		this.acttime = acttime;
	}
	public String getActlocation() {
		return actlocation;
	}
	public void setActlocation(String actlocation) {
		this.actlocation = actlocation;
	}
	private String actlocation;
}
