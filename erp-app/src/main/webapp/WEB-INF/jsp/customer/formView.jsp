<%-- 
    Document   : formView
    Created on : 28-Oct-2019, 19:44:41
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="save" method="post">
            <div>
                <label>Name</label>
                <input type="text" name="customer.name" />
            </div>
            <div>
                <label>CPF</label>
                <input type="text" name="customer.cpf"/>
            </div>
            <div>
                <label>Street</label>
                <input type="text" name="customer.address.street"/>
            </div>
            <div>
                <label>Cities</label>
                <select name="customer.address.city">

                    <c:forEach items="${citiesList}" var="city">
                        <option value="${city}">${city}</option>
                    </c:forEach>

                </select>
            </div>

            <div>
                <button type="submit" >Salvar</button>
            </div>
        </form>
        <div>
            <P>${saveComplete}</p>
        </div>
    </body>
</html>
