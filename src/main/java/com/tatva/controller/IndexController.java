package com.tatva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(path="/Index1", method=RequestMethod.GET)
	public String getIndexFile(){
		System.out.println("sdfjaslf");
		return "index.html";
	}
}
