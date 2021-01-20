package com.kinect.jspCommunity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usr/home/gugudan")
public class HomeGugudanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		resp.setContentType("text/html charset=UTF-8");
		resp.getWriter().append("hi");
		if(req.getParameter("dan") == null) {
			resp.getWriter().append("please input dan");
			return;
		}
		int dan = Integer.parseInt(req.getParameter("dan"));
		int limit=9;
		
		resp.getWriter().append(String.format("dan is %d",dan));
		
		for(int i=1;i<limit;i++) {
			resp.getWriter().append(String.format("<div> %d * %d = %d </div>",dan, i, dan*i));
		}
	}

}
