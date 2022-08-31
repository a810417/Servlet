<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改後員工資料</title>
</head>
<body style="background-color:#fdf5e6">
    <div align="center">
        <h2>修 改 後 員 工 資 料</h2>
        <jsp:useBean id="empNew" scope="request" class="com.lcpan.bean.EmpBean" />
        <table>
            <tr><td>員工編號</td><td><input type="text" disabled value="<%= empNew.getEmpno()%>"></td></tr>
            <tr><td>姓名</td><td><input type="text" disabled value="<%= empNew.getEname()%>"></td></tr>
            <tr><td>到職日</td><td><input type="text" disabled value="<%= empNew.getHiredate()%>"></td></tr>
            <tr><td>薪水</td><td><input type="text" disabled value="<%= empNew.getSalary()%>"></td></tr>
            <tr><td>部門編號</td><td><input type="text" disabled value="<%= empNew.getDeptno()%>"></td></tr>
            <tr><td>職稱</td><td><input type="text" disabled value="<%= empNew.getTitle()%>"></td></tr>
        </table>
        <h3 style="color:red">修 改 完 成 !</h3>
    </div>
</body>
</html>