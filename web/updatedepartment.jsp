<%-- 
    Document   : updatedepartment
    Created on : Mar 14, 2025, 11:59:55 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật Khoa</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Cập nhật Khoa</h1>
            <form action="updatedepartmentservlet" method="POST">
                <table>
                    <tr>
                        <td>ID Khoa</td>
                        <td><input type="text" name="txtID" value="${department.ID}" readonly="true" required/></td>
                    </tr>
                    <tr>
                        <td>Tên Khoa</td>
                        <td><input type="text" name="txtName" value="${department.name}" required/></td>
                    </tr>
                    <tr>
                        <td>Mô tả</td>
                        <td><input type="text" name="txtDescription" value="${department.description}" required/></td>
                    </tr>
                    <tr>
                        <td>Vị trí</td>
                        <td><input type="text" name="txtLocation" value="${department.location}" required/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Cập nhật Khoa" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="deletedepartmentservlet?id=${department.ID}" onclick="return confirm('Bạn có muốn xóa không?')">Xóa Khoa</a></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
