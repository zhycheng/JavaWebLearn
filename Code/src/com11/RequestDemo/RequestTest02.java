package com11.RequestDemo;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest02
 */
public class RequestTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTest02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//将存入到reques缓冲区的值以ISO-8859-1的方式获得到，以UTF-8的方式解码
		String name=request.getParameter("name");
		/*
		String encdoe=URLEncoder.encode(name,"ISO-8859-1");
		String nnn=URLDecoder.decode(encdoe,"UTF-8");*/
		String v=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		
		System.out.println("name:"+v);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		System.out.println("name:"+name);
	}

}
