package com.tatva.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class mainController {
	
	//private static Logger logger = LogManager.getLogger(mainController.class);
	
	@GetMapping(path="/hello")
	public String testing() {
		//System.out.println("Hello world!" + logger.getLevel());
		//logger.fatal("asjdhslkdf");
		return null;
		
	}
	
	//@GetMapping(path="/")
	public String test(HttpServletResponse res) throws IOException {
		System.out.println("asfdhaklsjfd");
		res.sendRedirect("hello");
		return "redirect:hello";
	}
}
