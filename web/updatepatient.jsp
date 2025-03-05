<%-- 
    Document   : updatepatient
    Created on : Mar 5, 2025, 7:30:45 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật Bệnh nhân</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Cập nhật Bệnh nhân</h1>
            <form action="updatepatientservlet" method="POST">
                <table>
                    <tr>
                        <td>ID Bệnh nhân</td>
                        <td><input type="text" name="txtID" value="${patient.ID}" readonly="true"/></td>
                    </tr>
                    <tr>
                        <td>Tên Bệnh nhân</td>
                        <td><input type="text" name="txtName" value="${patient.name}" required/></td>
                    </tr>
                    <tr>
                        <td>Giới tính</td>
                        <td>
                            <input type="radio" name="radioGender" value="Nam" ${patient.gender == null || patient.gender == 'Nam' ? 'checked' : ''}/>
                            <label>Nam</label>
                            <input type="radio" name="radioGender" value="Nữ" ${patient.gender == 'Nữ' ? 'checked' : ''}/>
                            <label>Nữ</label>
                            <input type="radio" name="radioGender" value="Khác" ${patient.gender == 'Khác' ? 'checked' : ''}/>
                            <label>Khác</label>
                        </td>
                    </tr>
                    <tr>
                        <td>Ngày sinh</td>
                        <td><input type="date" name="dateDOB" value="${patient.DOB}" required/></td>
                    </tr>
                    <tr>
                        <td>Tuổi</td>
                        <td><input type="number" name="numAge" value="${patient.age}" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Công việc</td>
                        <td><input type="text" name="txtJob" value="${patient.job}" /></td>
                    </tr>
                    <tr>
                        <td>Địa chỉ</td>
                        <td><input type="text" name="txtAddress" value="${patient.address}" required/></td>
                    </tr>
                    <tr>
                        <td>Quốc gia/Dân tộc</td>
                        <td><input type="text" name="txtNation" value="${patient.nation}" /></td>
                    </tr>
                    <tr>
                        <td>Nơi làm việc</td>
                        <td><input type="text" name="txtWorkplace" value="${patient.workplace}" /></td>
                    </tr>
                    <tr>
                        <td>Đối tượng</td>
                        <td>
                            <select name="selObjectID">
                                <option value="none" ${patient.objectID == 'none' || patient.objectID == null ? 'selected' : ''}>Trống</option>
                                <c:forEach items="${objectList}" var="i">
                                    <option value="${i.ID}" ${patient.objectID == i.ID ? 'selected' : ''}>${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Cập nhật Bệnh nhân" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
