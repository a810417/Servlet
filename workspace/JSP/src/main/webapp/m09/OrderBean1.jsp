<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using JavaBeans with JSP</title>
</head>
<body>
    <div align="center">
        <h3>Using JavaBeans with JSP</h3>
        <jsp:useBean id="order" class="com.lcpan.bean.OrderBean" scope="request" />
        <jsp:setProperty name="order" property="bookno" />
        <jsp:setProperty name="order" property="price" />
        <jsp:setProperty name="order" property="quantity" />
        <table border="1">
            <tr>
                <th>book no.
                <th>unit price
                <th>quantity
                <th>subTotal
            <tr align="right">
                <td>
                    <jsp:getProperty name="order" property="bookno" />
                <td>
                    $<jsp:getProperty name="order" property="price" />
                <td>
                    <jsp:getProperty name="order" property="quantity" />
                <td>
                    $<jsp:getProperty name="order" property="subTotal" />
        </table>
    </div>
</body>
</html>