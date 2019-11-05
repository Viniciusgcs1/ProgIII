<%-- 
    Document   : signOutView
    Created on : 04-Nov-2019, 19:17:47
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="authenticate" method="post">
                <div>
                    <label>Usuário</label>
                    <input type="text" name="userName">  
                </div>
                <div>
                    <label>Senha</label>
                    <input type="password" name="password">
                </div>
                <div>
                    <button type="submit">Entrar</button>
                </div>
            </form>

        </div>
    </body>
</html>
