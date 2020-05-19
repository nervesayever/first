package com.Bishe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bishe.bean.Recuitment;
import com.Bishe.mapper.RecuitMapper;
import com.Bishe.service.RecuitService;

@Service("recuitService")
@Transactional(rollbackFor = {Exception.class})
public class RecuitServiceImpl implements RecuitService {

	@Autowired
	RecuitMapper recuitMapper;
	
	@Override
	public int addrecuit(Recuitment recuit) {
		// TODO Auto-generated method stub
		return recuitMapper.addrecuit(recuit);
	}

	@Override
	public int deleterecuit(String recuitid) {
		// TODO Auto-generated method stub
		return recuitMapper.deleterecuit(recuitid);
	}

}
