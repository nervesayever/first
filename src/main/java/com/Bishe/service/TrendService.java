package com.Bishe.service;

import com.Bishe.bean.Trend;
import com.Bishe.until.TrendModel;

public interface TrendService {

	int addTrend(Trend trend);

	int deleteTrend(String trendid);

	TrendModel viewTrend();

}
