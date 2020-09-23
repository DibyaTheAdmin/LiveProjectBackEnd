package com.dr.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.bo.HomeBO;
import com.dr.dao.IHomeDao;
import com.dr.dto.HomeDTO;

@Service
public class HomeServiceImpl implements IHomeService {

	//inject dao
	@Autowired
	private IHomeDao dao;
	@Override
	public HomeDTO getHomeContent() {
		
		//use dao
		HomeBO hbo=dao.getHomeContent();
		
		//convert
		HomeDTO hdto=new HomeDTO();
		BeanUtils.copyProperties(hbo, hdto);
		return hdto;
	}

}
