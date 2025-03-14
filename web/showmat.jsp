<%-- 
    Document   : showmat.jsp
    Created on : Mar 13, 2025, 10:32:53 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Theo dõi và Điều trị</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Theo dõi và Điều trị</h1>
            <a class="tohome" href="homepage.jsp">HOME</a>
            <form action="showmatservlet" method="POST">
                <table>
                    <tr>
                        <td><input type="text" name="searchMAT" value="${matID}" placeholder="ID" /></td>
                        <td rowspan="3"><input type="submit" value="SEARCH" name="button" /></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="searchPatient" value="${patientName}" placeholder="Họ tên Bệnh nhân" /></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="searchEmployee" value="${employeeName}" placeholder="Họ tên Nhân viên" /></td>
                    </tr>
                </table>
            </form>
            <form action="addmat.jsp" method="POST">
                <input type="submit" value="Thêm Quan hệ Theo dõi và Điều trị" />
            </form>
            <table border="1" style="border-collapse: collapse">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Ngày theo dõi</th>
                        <th>Cân nặng Bệnh nhân (kg)</th>
                        <th>Huyết áp (mmHg)</th>
                        <th>Nhịp thở (lần/phút)</th>
                        <th>Y lệnh</th>
                        <th>Ngày thực hiện Y lệnh</th>
                        <th>Thực hiện Y lệnh</th>
                        <th>Họ tên Bệnh nhân</th>
                        <th>Họ tên Nhân viên</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${matList}" var="i">
                        <tr>
                            <td>${i.ID}</td>
                            <td>${i.monitorDate}</td>
                            <td>${i.weight}</td>
                            <td>${i.bloodPressure}</td>
                            <td>${i.respiratoryRate}</td>
                            <td>${i.medicalOrder}</td>
                            <td>${i.performDate}</td>
                            <td>${i.orderPerform}</td>
                            <td>${i.patientName}</td>
                            <td>${i.employeeName}</td>
                            <td>
                                <a href="updatematservlet?id=${i.ID}">Chọn</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
