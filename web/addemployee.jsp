<%-- 
    Document   : addemployee
    Created on : Mar 6, 2025, 9:52:46 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm Nhân viên mới</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Thêm Nhân viên mới</h1>
            <form action="addemployeeservlet" method="POST">
                <table>
                    <tr>
                        <td>Tên Nhân viên</td>
                        <td><input type="text" name="txtName" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Vai trò</td>
                        <td><input type="text" name="txtRole" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Khoa</td>
                        <td>
                            <select name="selDepartmentID">
                                <c:forEach items="${departmentList}" var="i">
                                    <option value="${i.ID}">${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Chuyên ngành</td>
                        <td>
                            <select name="selMajorID">
                                <c:forEach items="${majorList}" var="i">
                                    <option value="${i.ID}">${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Thêm Nhân viên" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
