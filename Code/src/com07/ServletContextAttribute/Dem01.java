package com07.ServletContextAttribute;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dem01
 */
public class Dem01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	this.getServletContext().setAttribute("zhycheng", "zhycheng");
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dem01() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String name=(String) this.getServletContext().getAttribute("zhycheng");
	        // TODO Auto-generated constructor stub
	        System.out.println("demo1 name is:"+name);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
