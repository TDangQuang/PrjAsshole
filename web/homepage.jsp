<%-- 
    Document   : homepage
    Created on : Mar 3, 2025, 8:21:38 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="content_menu"> <!--Giao dien cap nhat-->
            <ul>
                <li><a href="showpatientservlet">Thông tin bệnh nhân</a></li>
                <li><a href="showemployeeservlet">Thông tin nhân viên</a></li>
                <li><a href="showdepartmentservlet">Khoa</a></li>
            </ul>
        </div> <!-- Finish Giao dien cap nhat-->

        <div class="hangngang">
            <div class="content_banner"> <!--Giao dien xu ly-->
                <div class="top">
                    <div>
                        <p>Theo dõi và Điều trị</p>
                        <a href="showmatservlet">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>

                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>

                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>
                </div>

                <div class="mid">
                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>    

                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>

                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>
                </div>

                <div class="bottom">
                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>

                    <div>
                        <p>Function</p>
                        <a href="#">View Detail &nbsp; &nbsp; &gt; </a>
                    </div>

                    <div>
                        <p>Function</p>
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
