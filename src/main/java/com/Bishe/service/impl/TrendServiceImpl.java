package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.BranchMenber;
import com.Bishe.bean.Trend;
import com.Bishe.mapper.TrendMapper;
import com.Bishe.service.TrendService;
import com.Bishe.until.PageModel;
import com.Bishe.until.TrendModel;

@Service("trendService")
@Transactional(rollbackFor = {Exception.class})
public class TrendServiceImpl implements TrendService {

	@Autowired
	private TrendMapper trendMapper;
	@Override
	public int addTrend(Trend trend) {
		// TODO Auto-generated method stub
		return trendMapper.addTrend(trend);
	}
	@Override
	public int deleteTrend(String trendid) {
		// TODO Auto-generated method stub
		return trendMapper.deleteTred(trendid);
	}
	@Override
	public TrendModel viewTrend() {
		// TODO Auto-generated method stub
		
		TrendModel pm=new TrendModel();		
		pm.setTrend(trendMapper.viewTrend());
		pm.setComment(trendMapper.viewMomment());
		return pm;	
	}

}
