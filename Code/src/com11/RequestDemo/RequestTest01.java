package com11.RequestDemo;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest01
 */
public class RequestTest01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTest01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("请求方式："+request.getMethod());
		System.out.println("请求Ip："+request.getRemoteAddr());
		System.out.println("请求Ip："+request.getRemoteHost());
		System.out.println("请求URL："+request.getQueryString());
		System.out.println("请求路径URL："+request.getRequestURL());
		System.out.println("请求路径URI："+request.getRequestURI());
		System.out.println("请求的客户端浏览器类型："+request.getHeader("User-Agent"));
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("sex");
		String city=request.getParameter("city");
		String []hobby=request.getParameterValues("hobby");
		String info=request.getParameter("info");

		System.out.println("username:"+username+" password:"+password);
		System.out.println("sex:"+sex+" city:"+city);
		System.out.println(Arrays.toString(hobby));
		System.out.println("info:"+info);
		//还有
		//request.getParameterMap()
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
