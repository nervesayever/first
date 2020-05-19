package com.Bishe.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.Bishe.bean.New;

@Mapper
public interface NewMapper {

	int addNew(New news);

	int deleteNew(String newsid);

}
