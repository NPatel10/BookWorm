package com.tatva.controller;

import javax.swing.LayoutFocusTraversalPolicy;

import org.apache.tomcat.jni.Registry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sun.glass.ui.View;

@Controller
public class TestController {

	@RequestMapping("/")
	public String firtpafe(){
		return "redirect:Welcome";
	}
	
	@RequestMapping("/Welcome")
	public String indexpafe(){
		return "index.jsp";
	}
	
	@RequestMapping("/next")
	public String nextpafe(){
		return "next.jsp";
	}
	
//	
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry vr){
//		vr.jsp("/", "");
//		
//	}
//	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//	    registry
//	        .addViewController("/yourpath")
//	        .setViewName("yourtemplate");
//	}
}
