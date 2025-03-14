<%-- 
    Document   : updatemat
    Created on : Mar 13, 2025, 6:22:48 PM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật Quan hệ Theo dõi và Điều trị</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Cập nhật Quan hệ Theo dõi và Điều trị</h1>
            <form action="updatematservlet" method="POST">
                <table>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="txtID" value="${mat.ID}" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td>Ngày theo dõi</td>
                        <td><input type="date" name="dateMonitorDate" value="${mat.monitorDate}" required/></td>
                    </tr>
                    <tr>
                        <td>Cân nặng Bệnh nhân (kg)</td>
                        <td><input type="number" name="numWeight" value="${mat.weight}" min="0" step="0.01" required></td>
                    </tr>
                    <tr>
                        <td>Huyết áp (mmHg)</td>
                        <td><input type="number" name="numBloodPressure" value="${mat.bloodPressure}" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Nhịp thở (lần/phút)</td>
                        <td><input type="number" name="numRespiratoryRate" value="${mat.respiratoryRate}" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Y lệnh</td>
                        <td><input type="text" name="txtMedicalOrder" value="${mat.medicalOrder}" required/></td>
                    </tr>
                    <tr>
                        <td>Ngày thực hiện Y lệnh</td>
                        <td><input type="date" name="datePerformDate" value="${mat.performDate}" required/></td>
                    </tr>
                    <tr>
                        <td>Thực hiện Y lệnh</td>
                        <td><input type="text" name="txtOrderPerform" value="${mat.orderPerform}" required/></td>
                    </tr>
                    <tr>
                        <td>ID Bệnh nhân</td>
                        <td><input type="text" name="txtPatientID" value="${mat.patientID}" required/></td>
                    </tr>
                    <tr>
                        <td>ID Nhân viên</td>
                        <td><input type="text" name="txtEmployeeID" value="${mat.employeeID}" required/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Cập nhật Quan hệ Theo dõi và Điều trị" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="deletematservlet?id=${mat.ID}" onclick="return confirm('Bạn có muốn xóa không?')">Xóa Quan hệ Theo dõi và Điều trị</a></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
