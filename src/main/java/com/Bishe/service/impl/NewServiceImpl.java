package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.New;
import com.Bishe.mapper.NewMapper;
import com.Bishe.service.NewService;

@Service("newService")
@Transactional(rollbackFor = {Exception.class})
public class NewServiceImpl implements NewService {

	@Autowired
	private NewMapper newmapper;
	
	@Override
	public int addNew(New news) {
		// TODO Auto-generated method stub
		return newmapper.addNew(news);
	}

	@Override
	public int deleteNew(String newsid) {
		// TODO Auto-generated method stub
		return newmapper.deleteNew(newsid);
	}

}
