package com.lcpan.m07;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/GetSessionInfo")
public class GetSessionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);
//		System.out.println(session.getMaxInactiveInterval());
		
		String attName = request.getParameter("attrName");
		if (attName != null && attName.length() > 0) {
			String attValue = request.getParameter("attrValue");
			session.setAttribute(attName, attValue);
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Date created = new Date(session.getCreationTime());
		Date accessed = new Date(session.getLastAccessedTime());
//		int time = session.getMaxInactiveInterval();
		out.write("<html><body><h2>Session資訊</h2>");
		out.write("ID : " + session.getId() + "<br>");
		out.write("Created : " + created + "<br>");
		out.write("Last Accessed : " + accessed + "<p>");
//		out.write("Time : "+ time+"<br>");
		Enumeration<String> names = session.getAttributeNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = session.getAttribute(name).toString();
			out.write(name + " = " + value + "<br>");
		}

		out.write("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {
		 doGet(request, response);
	}
}
