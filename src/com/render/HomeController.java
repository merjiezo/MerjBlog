package com.render;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;

public class HomeController {
	
	@Controller(value="index")
	public String index(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("info", "Index Page");
		return "index";
	}
	
	@Controller(value="lalala")
	public String lalala(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("info", "lalala Page");
		return "index";
	}
	
}
