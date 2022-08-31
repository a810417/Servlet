package com.lcpan.m05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListTrainingCenters")
public class ListTrainingCenters extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListTrainingCenters() {
		super();
	}

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		List<TrainingCenter> list = (ArrayList<TrainingCenter>) context.getAttribute("centers");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String title = "資策會各訓練單位";
		String html = "<html><head><title>" + title + "</title></head>" + "<body><h3>" + title + "</h3>"
				+ "<table border=1><tr><th>中心名稱<th>地址<th>電話";
		for (TrainingCenter center : list) {
			html += "<tr><td>" + center.getName() + "<td>" + center.getAddress() + "<td>" + center.getTel();
		}
		html += "</table></body></html>";
		out.print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
