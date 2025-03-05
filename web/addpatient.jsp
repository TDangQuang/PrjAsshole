<%-- 
    Document   : addpatient
    Created on : Mar 3, 2025, 11:45:17 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm Bệnh nhân mới</title>
        <link rel="stylesheet" href="css/styleUpdate.css">
    </head>
    <body>
        <div class="container">
            <h1>Thêm Bệnh nhân mới</h1>
            <form action="addpatientservlet" method="POST">
                <table>
                    <tr>
                        <td>Tên Bệnh nhân</td>
                        <td><input type="text" name="txtName" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Giới tính</td>
                        <td>
                            <input type="radio" name="radioGender" value="Nam" checked="checked" />
                            <label>Nam</label>
                            <input type="radio" name="radioGender" value="Nữ" />
                            <label>Nữ</label>
                            <input type="radio" name="radioGender" value="Khác" />
                            <label>Khác</label>
                        </td>
                    </tr>
                    <tr>
                        <td>Ngày sinh</td>
                        <td><input type="date" name="dateDOB" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Tuổi</td>
                        <td><input type="number" name="numAge" min="0" step="1" required></td>
                    </tr>
                    <tr>
                        <td>Công việc</td>
                        <td><input type="text" name="txtJob" value="" /></td>
                    </tr>
                    <tr>
                        <td>Địa chỉ</td>
                        <td><input type="text" name="txtAddress" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Quốc gia/Dân tộc</td>
                        <td><input type="text" name="txtNation" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nơi làm việc</td>
                        <td><input type="text" name="txtWorkplace" value="" /></td>
                    </tr>
                    <tr>
                        <td>Đối tượng</td>
                        <td>
                            <select name="selObjectID">
                                <option value="none" selected="true">Trống</option>
                                <c:forEach items="${objectList}" var="i">
                                    <option value="${i.ID}">${i.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Thêm Bệnh nhân" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
