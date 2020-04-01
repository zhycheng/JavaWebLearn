package com.servletcontext.test;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1
 */
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext config=getServletContext();
		String mimeType=config.getMimeType("aa.txt");
		System.out.println(mimeType);
		String path=config.getContextPath();
		System.out.println(path);
		
		String name=config.getInitParameter("name");
		String ps=config.getInitParameter("ps");
		System.out.println("name:"+name+" ps:"+ps);
		Enumeration<String> names=config.getInitParameterNames();
		while(names.hasMoreElements())
		{
			String key=names.nextElement();
			String value=config.getInitParameter(key);
			System.out.println("key:"+key+" value:"+value);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
