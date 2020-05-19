package com.Bishe.until;

import java.util.List;

import com.Bishe.bean.Comment;
import com.Bishe.bean.Trend;

public class TrendModel {

	private List<Trend> trend;
	private List<Comment> comment;
	public List<Trend> getTrend() {
		return trend;
	}
	public void setTrend(List<Trend> trend) {
		this.trend = trend;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
}
