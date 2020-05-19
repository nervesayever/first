package com.Bishe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Bishe.bean.Comment;
import com.Bishe.bean.Trend;

@Mapper
public interface TrendMapper {

	int addTrend(Trend trend);

	int deleteTred(String trendid);

	List<Trend> viewTrend();

	List<Comment> viewMomment();

}
