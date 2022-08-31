<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using JavaBeans with JSP</title>
</head>
<body>
	<h3>Using JavaBean with JSP</h3>
	<jsp:useBean id="stringBean" class="com.lcpan.bean.StringBean" />
	<ol>
		<li>Initial value (from jsp:getProperty): <i><jsp:getProperty
					name="stringBean" property="message" /></i>
		<li>Initial value (from JSP expression): <i><%=stringBean.getMessage()%></i>
		<li><jsp:setProperty name="stringBean" property="message"
				value="This is a test" />Value after setting property with
			jsp:setProperty: <i><jsp:getProperty name="stringBean"
					property="message" /></i>
		<li><%
		stringBean.setMessage("Learning JSP is wonderful");
		%>Value after setting property with expression: <i><%=stringBean.getMessage()%></i>
	</ol>
</body>
</html>