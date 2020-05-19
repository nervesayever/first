package com.Bishe.bean;

import java.sql.Date;

public class Comment {
		
	private String userid;
	private String trendid;
	private Date date;
	private String commenttext;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTrendid() {
		return trendid;
	}
	public void setTrendid(String trendid) {
		this.trendid = trendid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCommenttext() {
		return commenttext;
	}
	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}
	
}