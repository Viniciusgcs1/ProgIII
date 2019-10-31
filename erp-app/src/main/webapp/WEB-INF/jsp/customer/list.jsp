<%-- 
    Document   : list
    Created on : 30-Oct-2019, 19:33:08
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List page</title>
    </head>
    <body>
        <h1>Customers</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>CPF</th>
                <th>City</th>
                <th>Street</th>
                <th>Actions</th>
            </tr>
            <c:forEach items="${customerList}" var="customer" >
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.cpf}</td>
                    <td>${customer.address.street}</td>
                    <td>${customer.address.city}</td>
                    <td>
                        <a href="">Edit</a>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </body>
</html>
