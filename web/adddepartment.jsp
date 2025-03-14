<%-- 
    Document   : adddepartment
    Created on : Mar 14, 2025, 11:45:49 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm Khoa mới</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Thêm Khoa mới</h1>
            <form action="adddepartmentservlet" method="POST">
                <table>
                    <tr>
                        <td>Tên Khoa</td>
                        <td><input type="text" name="txtName" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Mô tả</td>
                        <td><input type="text" name="txtDescription" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Vị trí</td>
                        <td><input type="text" name="txtLocation" value="" required/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Thêm Khoa" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
