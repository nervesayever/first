package com.Bishe.bean;

import java.sql.Date;

public class Trend {
		
	private String userid;
	private String trendis;
	private Date date;
	private int dingnum;
	private int commentnum;
	private String picurl;
	private String picurl1;
	private String trendcontent;
	public String getTrendcontent() {
		return trendcontent;
	}
	public void setTrendcontent(String trendcontent) {
		this.trendcontent = trendcontent;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public String getPicurl1() {
		return picurl1;
	}
	public void setPicurl1(String picurl1) {
		this.picurl1 = picurl1;
	}
	public String getPicurl2() {
		return picurl2;
	}
	public void setPicurl2(String picurl2) {
		this.picurl2 = picurl2;
	}
	private String picurl2;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTrendis() {
		return trendis;
	}
	public void setTrendis(String trendis) {
		this.trendis = trendis;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDingnum() {
		return dingnum;
	}
	public void setDingnum(int dingnum) {
		this.dingnum = dingnum;
	}
	public int getCommentnum() {
		return commentnum;
	}
	public void setCommentnum(int commentnum) {
		this.commentnum = commentnum;
	}
	
}
