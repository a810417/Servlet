<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Using JavaBeans with JSP</title>
</head>

<body>
    <div align="center">
        <h3>Using JavaBeans with JSP</h3>
        <jsp:useBean id="order" class="com.lcpan.bean.OrderBean1.jsp" scope="request" />
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
                    <jsp:getProperty name="order" property="price" />
                <td>
                    <jsp:getProperty name="order" property="quantity" />
                <td>
                    <jsp:getProperty name="order" property="subTotal" />

        </table>

    </div>
</body>

</html>