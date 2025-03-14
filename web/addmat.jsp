<%-- 
    Document   : addmonitoringandtreatment.jsp
    Created on : Mar 13, 2025, 10:46:54 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm Quan hệ Theo dõi và Điều trị</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Thêm Quan hệ Theo dõi và Điều trị</h1>
            <form action="addmatservlet" method="POST">
                <table>
                    <tr>
                        <td>Ngày theo dõi</td>
                        <td><input type="date" name="dateMonitorDate" value="${monitorDate}" required/></td>
                    </tr>
                    <tr>
                        <td>Cân nặng Bệnh nhân (kg)</td>
                        <td><input type="number" name="numWeight" value="${weight}" min="0" step="0.01" required></td>
                    </tr>
                    <tr>
                        <td>Huyết áp (mmHg)</td>
                        <td><input type="number" name="numBloodPressure" value="${bloodPressure}" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Nhịp thở (lần/phút)</td>
                        <td><input type="number" name="numRespiratoryRate" value="${respiratoryRate}" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Y lệnh</td>
                        <td><input type="text" name="txtMedicalOrder" value="${medicalOrder}" required/></td>
                    </tr>
                    <tr>
                        <td>Ngày thực hiện Y lệnh</td>
                        <td><input type="date" name="datePerformDate" value="${performDate}" required/></td>
                    </tr>
                    <tr>
                        <td>Thực hiện Y lệnh</td>
                        <td><input type="text" name="txtOrderPerform" value="${orderPerform}" required/></td>
                    </tr>
                    <tr>
                        <td>ID Bệnh nhân</td>
                        <td><input type="text" name="txtPatientID" value="${patientID}" required/></td>
                    </tr>
                    <tr>
                        <td>ID Nhân viên</td>
                        <td><input type="text" name="txtEmployeeID" value="${employeeID}" required/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Thêm Quan hệ Theo dõi và Điều trị" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
