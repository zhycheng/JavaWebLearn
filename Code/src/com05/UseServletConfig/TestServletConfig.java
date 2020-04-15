package com05.UseServletConfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletConfig
 */
public class TestServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServletConfig() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc=this.getServletConfig();  
		String username=sc.getInitParameter("username");
		String password=sc.getInitParameter("password");
		System.out.println("username: "+username+" password:"+password);
		System.out.println("getname:"+sc.getServletName());
		Enumeration<String> names=sc.getInitParameterNames();
		while(names.hasMoreElements())
		{
			String key=names.nextElement();
			String value=sc.getInitParameter(key);
			System.out.println("key:"+value+" value:"+value);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
