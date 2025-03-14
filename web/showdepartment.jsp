<%-- 
    Document   : showdepartment
    Created on : Mar 14, 2025, 11:25:33 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Khoa</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Khoa</h1>
            <a class="tohome" href="homepage.jsp">HOME</a>
            <form action="showdepartmentservlet" method="POST">
                <table>
                    <tr>
                        <td>Tìm kiếm</td>
                        <td><input type="text" name="search" value="${departmentName}" placeholder="Tên Khoa" /></td>
                        <td><input type="submit" value="SEARCH" name="button" /></td>
                    </tr>
                </table>
            </form>
            <form action="adddepartment.jsp" method="POST">
                <input type="submit" value="Thêm Khoa mới" />
            </form>
            <table border="1" style="border-collapse: collapse">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Mã Khoa</th>
                        <th>Tên Khoa</th>
                        <th>Mô tả</th>
                        <th>Vị trí</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="stt" value="1" />
                    <c:forEach items="${departmentList}" var="i">
                        <tr>
                            <td>${stt}</td>
                            <td>${i.ID}</td>
                            <td>${i.name}</td>
                            <td>${i.description}</td>
                            <td>${i.location}</td>
                            <td>
                                <a href="updatedepartmentservlet?id=${i.ID}">Chọn</a>
                            </td>
                        </tr>
                        <c:set var="stt" value="${stt+1}" />
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
