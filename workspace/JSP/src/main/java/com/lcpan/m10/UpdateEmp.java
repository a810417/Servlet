package com.lcpan.m10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcpan.bean.EmpBean;

@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=servdb;trustServerCertificate=true";
	private static final String USER = "sa";
	private static final String PASSWORD = "P@ssw0rd";
	private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String SQL = "update employee set ename=?, hiredate=?, salary=?, deptno=?, title=? where empno = ?";
	Connection conn;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empnoNew = request.getParameter("empnoNew");
		String enameNew = request.getParameter("enameNew");
		String hiredateNew = request.getParameter("hiredateNew");
		String salaryNew = request.getParameter("salaryNew");
		String deptnoNew = request.getParameter("deptnoNew");
		String titleNew = request.getParameter("titleNew");

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preState = conn.prepareStatement(SQL);
			
			preState.setString(1, enameNew);
			preState.setString(2, hiredateNew);
			preState.setInt(3, Integer.valueOf(salaryNew));
			preState.setDouble(4, Double.valueOf(deptnoNew));
			preState.setString(5, titleNew);
			preState.setString(6, empnoNew);
			preState.executeUpdate();
			
			EmpBean empNew = new EmpBean();
			empNew.setEmpno(empnoNew);
			empNew.setEname(enameNew);
			empNew.setHiredate(hiredateNew);
			empNew.setSalary(salaryNew);
			empNew.setDeptno(deptnoNew);
			empNew.setTitle(titleNew);
			request.setAttribute("empNew", empNew);
			request.getRequestDispatcher("/m10/UpdateEmp.jsp").forward(request, response);
			preState.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
