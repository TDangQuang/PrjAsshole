<%-- 
    Document   : updateemployee
    Created on : Mar 6, 2025, 10:45:23 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật Nhân viên</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Cập nhật Nhân viên</h1>
            <form action="updateemployeeservlet" method="POST">
                <table>
                    <tr>
                        <td>ID Nhân viên</td>
                        <td><input type="text" name="txtID" value="${employee.ID}" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td>Tên Nhân viên</td>
                        <td><input type="text" name="txtName" value="${employee.name}" required/></td>
                    </tr>
                    <tr>
                        <td>Vai trò</td>
                        <td><input type="text" name="txtRole" value="${employee.role}" required/></td>
                    </tr>
                    <tr>
                        <td>Khoa</td>
                        <td>
                            <select name="selDepartmentID">
                                <c:forEach items="${departmentList}" var="i">
                                    <option value="${i.ID}" ${employee.departmentID == i.ID ? 'selected' : null}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Chuyên ngành</td>
                        <td>
                            <select name="selMajorID">
                                <c:forEach items="${majorList}" var="i">
                                    <option value="${i.ID}" ${employee.majorID == i.ID ? 'selected' : null}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Cập nhật Nhân viên" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="deleteemployeeservlet?id=${employee.ID}" onclick="return confirm('Bạn có muốn xóa không?')">Xóa Nhân viên</a></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
