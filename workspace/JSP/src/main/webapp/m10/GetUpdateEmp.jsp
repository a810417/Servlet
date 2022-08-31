<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>員工資料</title>
</head>
<body style="background-color: #fdf5e6">
	<div align="center">
		<h2>員 工 資 料</h2>
		
		<form method="post" action="http://localhost:8080/JSP/UpdateEmp">
			<jsp:useBean id="emp" scope="request" class="com.lcpan.bean.EmpBean" />

			<table>
				<tr>
					<td>員工編號</td>
					<td><input type="text" readonly value="<%=emp.getEmpno()%>"
						name="empnoNew"></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" value="<%=emp.getEname()%>"
						name="enameNew"></td>
				</tr>
				<tr>
					<td>到職日</td>
					<td><input type="text" value="<%=emp.getHiredate()%>"
						name="hiredateNew"></td>
				</tr>
				<tr>
					<td>薪水</td>
					<td><input type="text" value="<%=emp.getSalary()%>"
						name="salaryNew"></td>
				</tr>
				<tr>
					<td>部門編號</td>
					<td><input type="text" value="<%=emp.getDeptno()%>"
						name="deptnoNew"></td>
				</tr>
				<tr>
					<td>職稱</td>
					<td><input type="text" value="<%=emp.getTitle()%>"
						name="titleNew"></td>
				</tr>
			</table>
			<input type="submit" value="修改" />
		</form>
	</div>
</body>
</html>