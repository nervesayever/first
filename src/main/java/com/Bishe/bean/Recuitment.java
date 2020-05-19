package com.Bishe.bean;

import java.sql.Date;

public class Recuitment {

	private int recuitid;
	private int phone;
	private String recuitcompany;
	private String recuitposition;
	private String companyinfo;
	private String positionrequire;
	private String compensation;
	private String email;
	private Date enddate;
	public int getRecuitid() {
		return recuitid;
	}
	public void setRecuitid(int recuitid) {
		this.recuitid = recuitid;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getRecuitcompany() {
		return recuitcompany;
	}
	public void setRecuitcompany(String recuitcompany) {
		this.recuitcompany = recuitcompany;
	}
	public String getRecuitposition() {
		return recuitposition;
	}
	public void setRecuitposition(String recuitposition) {
		this.recuitposition = recuitposition;
	}
	public String getCompanyinfo() {
		return companyinfo;
	}
	public void setCompanyinfo(String companyinfo) {
		this.companyinfo = companyinfo;
	}
	public String getPositionrequire() {
		return positionrequire;
	}
	public void setPositionrequire(String positionrequire) {
		this.positionrequire = positionrequire;
	}
	public String getCompensation() {
		return compensation;
	}
	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

}
