package com.lcpan.m03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/IncludeOrigin")
public class IncludeOrigin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Origin tasks one is done<br>");
		request.getRequestDispatcher("/IncludeOther").include(request, response);
		response.getWriter().append("Origin tasks two is done<br>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {
		 doGet(request, response);
	}
}
