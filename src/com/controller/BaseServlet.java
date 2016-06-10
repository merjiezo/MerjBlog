package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	/**
	 * AutoLoad
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Overridden method that simply returns {@code null} when no
	 * ServletConfig set yet.
	 * @see #getServletConfig()
	 */
	@Override
	public final String getServletName() {
		return (getServletConfig() != null ? getServletConfig().getServletName() : null);
	}

	/**
	 * Overridden method that simply returns {@code null} when no
	 * ServletConfig set yet.
	 * @see #getServletConfig()
	 */
	@Override
	public final ServletContext getServletContext() {
		return (getServletConfig() != null ? getServletConfig().getServletContext() : null);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		webApplication(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		webApplication(req, res);
	}

	protected void webApplication(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
