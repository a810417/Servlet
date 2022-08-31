package com.lcpan.m02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetParam")
public class GetParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		response.setContentType("text/html;charset=UTF-8");
		// 寫法 1
//		response.getWriter().append("<html><body><h3>Hello ").append(username).append(", 你好<br><br> your age is ").append(age).append("</h3></body></html>");
		// 寫法 2
		PrintWriter out = response.getWriter();
		String html = "<html><body><h3>Hello" + username + ", 你好<br><br> your age is " + age + "</h3></body></html>";
		out.print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
