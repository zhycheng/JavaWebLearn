package com12.UseCookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录用户上次访问时间的servlet
 */
public class VisitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * 第一次访问显示你好，欢迎来到本网站
		 * 记录访问时间，存入cookie，回写到浏览器
		 * 如果不是第一次访问
		 * 从cookie中获得上次访问时间，显示到页面
		 * 记录当前访问时间，存入到cookie，回写到浏览器
		 */
		//判断是否是第一次访问，从指定的cookie的数组中获取指定名称的cookie
		Cookie[] cookies=request.getCookies();
		Cookie c=CookieUtils.findCookie(cookies, "lastVisit");
		if(c==null)
		{
			//第一次访问
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>你好，欢迎访问本网站</h1>");
		}
		else
		{
			//不是第一次访问
			String value=c.getValue();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>你好，你的上次访问时间为"+value+"</h1>");
			
		}
		Date d=new Date();
		Cookie cc=new Cookie("lastVisit",d.toLocaleString());
		//设置有效路径  有效时长
		cc.setPath("/JavaWeb");
		cc.setMaxAge(3600);//秒为单位
		
		response.addCookie(cc);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
