<%-- 
    Document   : login
    Created on : Mar 14, 2025, 4:46:54 PM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <h1>Đăng nhập</h1>
        <form action="loginservlet" method="POST">
            <table border="1" style="border-collapse: collapse">
                <tr>
                    <td>Tên tài khoản</td>
                    <td><input type="text" name="txtUsername" value="${username}" autocomplete="username" required/></td>
                </tr>
                <tr>
                    <td>Mật khẩu</td>
                    <td><input type="password" name="txtPassword" value="${password}" autocomplete="current-password" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Đăng nhập" /></td>
                </tr>
            </table>
            <p style="text-align: center">${error}</p>
        </form>
    </body>
</html>
