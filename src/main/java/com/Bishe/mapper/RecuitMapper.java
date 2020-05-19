package com.Bishe.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.Bishe.bean.Recuitment;

@Mapper
public interface RecuitMapper {

	int addrecuit(Recuitment recuit);

	int deleterecuit(String recuitid);

}
