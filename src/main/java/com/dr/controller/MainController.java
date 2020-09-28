package com.dr.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dr.dto.HomeDTO;
import com.dr.service.IHomeService;

@Controller
public class MainController {
	
	//inject service
	@Autowired
	private IHomeService service;
	//Home Page 
	@GetMapping("home.html")
	public String home(Map<String,Object>map) {
		
		//use service
		HomeDTO hdto=service.getHomeContent();
		
		//add to map
		map.put("homeContent", hdto);
		return "home";
	}
	
	//Geo Politics Blog
	@GetMapping("geo.html")
	public String geoPolitics() {
		return "geopolitics";
	}
}
