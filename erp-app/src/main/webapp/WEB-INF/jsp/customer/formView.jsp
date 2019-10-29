<%-- 
    Document   : formView
    Created on : 28-Oct-2019, 19:44:41
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <button type="submit" >Salvar</button>
            </div>
        </form>
        <div>
            <P>${SaveComplete}</p>
        </div>
    </body>
</html>
