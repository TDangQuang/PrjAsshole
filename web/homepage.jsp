<%-- 
    Document   : homepage
    Created on : Mar 3, 2025, 8:21:38 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="css/style.css">
<html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div> <!--content container-->
            <div class="content_logo"> <!--Tai khoan-->
                <img src="images/MyAccount.png" alt="Tài Khoản">
<!--                <div class="dropdownAccount">
                    <a href="#">Thông tin Tài khoản</a>
                    <a href="#">Thông báo</a>
                    <a href="#">Đăng xuất</a>
                </div>-->
            </div> 

            <div class="content_menu"> <!--Giao dien cap nhat-->
                <ul>
                    <li><a href="#">Thông tin bệnh nhân</a></li>
                    <li><a href="#">Thông tin nhân viên</a></li>
                    <li><a href="#">Thuốc</a></li>
                    <li><a href="#">Đối tượng xét nghiệm/chiếu chụp</a></li>
                    <li><a href="#">Dịch vụ</a></li>
                    <li><a href="#">Bệnh án</a></li>
                    <li><a href="#">Giường bệnh</a></li>
                    <li><a href="#">Khoa</a></li>
                    <li><a href="#">Phẫu thuật</a></li>
                    <li><a href="#">Phòng khám</a></li>
                </ul>
            </div> <!-- Finish Giao dien cap nhat-->

            <div class="hangngang">
                <div class="content_banner"> <!--Giao dien xu ly-->
                    <div class="top">
                        <div>
                            <p>Tạo phiếu khám bệnh và Ghi sổ bệnh nhân</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Lập bênh án và Ghi sổ khám bệnh</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Tạo phiếu xét nghiệm</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>   

                        <div>
                            <p>Lập phiếu chiếu chụp X-Quang</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Kê đơn thuốc và Ghi sổ khám bệnh</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>
                    </div>

                    <div class="mid">
                        <div>
                            <p>Lập phiếu khám bệnh vào viện và Ghi sổ khám bệnh</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>     

                        <div>
                            <p>Lập phiếu phẫu thuật</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Tạo phiếu làm dịch vụ</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Tạo phiếu phân giường</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>
                    </div>

                    <div class="bottom">
                        <div>
                            <p>Lập lệnh(Tờ điều trị)</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Lập phiếu xuất thuốc</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Cập nhật bệnh nhân ra viện và in Giấy ra viện</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>

                        <div>
                            <p>Cập nhật bệnh nhân chuyển viện và in Giấy chuyển viện</p>
                            <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                        </div>
                    </div>
                </div> <!-- Giao dien xu ly-->

                <div class="quick-links">
                    <div class="quick-links-header">
                        Quick Links
                    </div>
                    <ul>
                        <li><a href="#">Quick Links here...</a></li>
                    </ul>
                </div>
            </div>
        </div> <!--Finish container-->
    </body>
</html>
