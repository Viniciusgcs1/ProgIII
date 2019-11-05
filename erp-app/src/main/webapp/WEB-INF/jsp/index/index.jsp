<%-- 
    Document   : index
    Created on : 30-Oct-2019, 19:48:24
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <p>User Logger: ${userSession.userName}</p>
        <p>
            <a href="auth/signout">Sair </a>
        </p>
    </body>
</html>
