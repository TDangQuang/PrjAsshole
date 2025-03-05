<%-- 
    Document   : ShowPatient
    Created on : Mar 3, 2025, 9:55:12 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin Bệnh nhân</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Thông tin Bệnh nhân</h1>
            <a class="tohome" href="homepage.jsp">HOME</a>
            <form action="showpatientservlet" method="POST">
                <table>
                    <tr>
                        <td>Đối tượng xét nghiệm/chụp chiếu</td>
                        <td>
                            <select name="filter">
                                <option value="all" ${objectID == 'all' || objectID == null ? 'selected' : ''}>Tất cả</option>
                                <c:forEach items="${objectList}" var="i">
                                    <option value="${i.ID}" ${objectID == i.ID ? 'selected' : ''}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td><input type="submit" value="FILTER" name="button" /></td>
                    </tr>
                    <tr>
                        <td>Tìm kiếm</td>
                        <td><input type="text" name="search" value="${patientName}" placeholder="Họ tên Bệnh nhân" /></td>
                        <td><input type="submit" value="SEARCH" name="button" /></td>
                    </tr>
                </table>
            </form>
            <form action="addpatientservlet" method="GET">
                <input type="submit" value="Thêm Bệnh nhân mới" />
            </form>
            <table border="1" style="border-collapse: collapse">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Họ tên</th>
                        <th>Giới tính</th>
                        <th>Ngày sinh</th>
                        <th>Tuổi</th>
                        <th>Công việc</th>
                        <th>Địa chỉ</th>
                        <th>Quốc gia/Dân tộc</th>
                        <th>Nơi làm việc</th>
                        <th>Đối tượng</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="stt" value="1" />
                    <c:forEach items="${patientList}" var="i">
                        <tr>
                            <td>${stt}</td>
                            <td>${i.name}</td>
                            <td>${i.gender}</td>
                            <td>${i.DOB}</td>
                            <td>${i.age}</td>
                            <td>${i.job}</td>
                            <td>${i.address}</td>
                            <td>${i.nation}</td>
                            <td>${i.workplace}</td>
                            <td>${i.objectName}</td>
                            <td>
                                <a href="updatepatientservlet?id=${i.ID}">Cập nhật</a>
                                <a href="deletepatientservlet?id=${i.ID}">Xóa</a>
                            </td>
                        </tr>
                        <c:set var="stt" value="${stt+1}" />
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>