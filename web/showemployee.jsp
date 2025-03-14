<%-- 
    Document   : showemployee
    Created on : Mar 6, 2025, 9:36:38 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin Nhân viên</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body><div class="container">
            <h1>Thông tin Nhân viên</h1>
            <a class="tohome" href="homepage.jsp">HOME</a>
            <form action="showemployeeservlet" method="POST">
                <table>
                    <tr>
                        <td>Khoa</td>
                        <td>
                            <select name="filterDepartment">
                                <option value="all" ${departmentID == 'all' || departmentID == null ? 'selected' : ''}>Tất cả</option>
                                <c:forEach items="${departmentList}" var="i">
                                    <option value="${i.ID}" ${departmentID == i.ID ? 'selected' : ''}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td rowspan="2"><input type="submit" value="FILTER" name="button" /></td>
                    </tr>
                    <tr>
                        <td>Chuyên ngành</td>
                        <td>
                            <select name="filterMajor">
                                <option value="all" ${majorID == 'all' || majorID == null ? 'selected' : ''}>Tất cả</option>
                                <c:forEach items="${majorList}" var="i">
                                    <option value="${i.ID}" ${majorID == i.ID ? 'selected' : ''}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Tìm kiếm</td>
                        <td><input type="text" name="search" value="${employeeName}" placeholder="Họ tên Nhân viên" /></td>
                        <td><input type="submit" value="SEARCH" name="button" /></td>
                    </tr>
                </table>
            </form>
            <form action="addemployeeservlet" method="GET">
                <input type="submit" value="Thêm Nhân viên mới" />
            </form>
            <table border="1" style="border-collapse: collapse">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Họ tên</th>
                        <th>Vai trò</th>
                        <th>Khoa</th>
                        <th>Chuyên ngành</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="stt" value="1" />
                    <c:forEach items="${employeeList}" var="i">
                        <tr>
                            <td>${stt}</td>
                            <td>${i.name}</td>
                            <td>${i.role}</td>
                            <td>${i.departmentName}</td>
                            <td>${i.majorName}</td>
                            <td>
                                <a href="updateemployeeservlet?id=${i.ID}">Chọn</a>
                            </td>
                        </tr>
                        <c:set var="stt" value="${stt+1}" />
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
