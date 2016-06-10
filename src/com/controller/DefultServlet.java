package com.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DefultServlet extends BaseServlet {

	/**
	 * The home page is here
	 */
	private static final long serialVersionUID = 1L;
	private String[] context;
	//this is a config visuble, it can be put into xml file.
	private String conPackage = "com.render";
	private String jspDefultPath = "/WEB-INF/jsp/";
	
	@Override
	public void init() throws ServletException {
	}
	
	@Override
	protected void webApplication(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.getContext(req.getServletPath());
		Object realClass;
		String render = "";
		try {
			realClass = Class.forName(context[0]).newInstance();
			Class<?> clazz =  realClass.getClass();
			Method method = clazz.getMethod(context[1], HttpServletRequest.class, HttpServletResponse.class);
			render = (String) method.invoke(realClass, req, res );
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher(this.jspDefultPath+"/"+render+".jsp").forward(req, res);
	}
	
	private void getContext(String con) {
		con = con.substring(1);
		this.context = con.split("/");
		if (this.context[0] != "" && this.context[1] != "") {
			this.context[0] = this.conPackage+"."+context[0].substring(0, 1).toUpperCase()+context[0].substring(1)+"Controller";
			try {
				if (ControllerMethodimpl.getControllerMethod(Class.forName(this.context[0]), this.context[1])) {
				} else {
					//404 No Found
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//DEFULT
	}
}
