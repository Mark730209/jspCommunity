package com.kinect.jspCommunity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
//		String lang = ""; 
		String lang = request.getParameter("lang");
		int count = request.getParameter("count") != null ? Integer.parseInt(request.getParameter("count")) : 1;
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("金寿男 Mark Kim\n김수남 \nServed at: "+lang).append(request.getContextPath());
		
		String hello="";
		if(lang.equals("kr")) {
			hello = "안녕하세요.";
			
		}
		for(int i=1; i<=count; i++) {
			response.getWriter().append(hello+"<br>");			
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
