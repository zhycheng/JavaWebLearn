package com01.Demo.ServletHello;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestHello implements Servlet{
	
	@Override
	public void service(ServletRequest arg0, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//向页面输出一个字符串
		resp.getWriter().println("<h1>Hello Servlet...</h1>");
	}
	
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
