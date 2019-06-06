package com.angularjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class Controler {

	@RequestMapping(value="")
	public String hello(ModelMap mp) {
		mp.put("hello", "Hello welcome to Thymeleaf context!!");
		return "hello_world";
	}
        @RequestMapping(value="hello")
	public String well(){		
		return "hi";
	}
        @RequestMapping(value="users")
	public String list(){		
		return "User.jsp";
	}
	@RequestMapping(value="bye")
	public String byee(ModelMap mp) {
		mp.put("goodbye", "Bye World!!");
		return "good_bye";
	}
	
}