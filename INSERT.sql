INSERT INTO Patient (ID, [name], gender, DOB, age, job, [address], nation, workplace) VALUES  
('P001', N'Nguyễn Văn Minh', N'Nam', '1985-06-15', 39, N'Kỹ sư', N'123 Đường Lê Lợi, Hà Nội', N'Kinh', N'Công ty Tech Việt'),  
('P002', N'Trần Thị Lan', N'Nữ', '1992-09-23', 32, N'Giáo viên', N'456 Đường Nguyễn Trãi, Hồ Chí Minh', N'Tày', N'Trường Tiểu học HCM'),  
('P003', N'Phạm Hữu Nam', N'Nam', '1978-12-05', 46, N'Bác sĩ', N'789 Đường Hai Bà Trưng, Đà Nẵng', N'Nùng', N'Bệnh viện Trung ương ĐN'),  
('P004', N'Lê Mai Hoa', N'Nữ', '2000-04-11', 24, N'Sinh viên', N'101 Đường Phan Châu Trinh, Thái Bình', N'Mường', N'Đại học Y Dược Thái Bình'),  
('P005', N'Hoàng Văn Bình', N'Nam', '1965-11-30', 59, N'Đã nghỉ hưu', N'222 Đường Trần Hưng Đạo, Hải Phòng', N'Kinh', N'Không'),  
('P006', N'Võ Thu Hương', N'Nữ', '1989-08-17', 35, N'Y tá', N'333 Đường Nguyễn Huệ, Cần Thơ', N'Chăm', N'Bệnh viện Đa khoa Cần Thơ'),  
('P007', N'Đặng Văn Sơn', N'Nam', '1995-01-25', 29, N'Cảnh sát', N'444 Đường Lý Tự Trọng, Lâm Đồng', N'H''Mông', N'Công an Tỉnh Lâm Đồng'),  
('P008', N'Bùi Thị Ngọc', N'Nữ', '1982-07-08', 42, N'Luật sư', N'555 Đường Lê Thánh Tông, Quảng Ninh', N'Ê Đê', N'Văn phòng Luật sư Quảng Ninh'),  
('P009', N'Lâm Quốc Bảo', N'Nam', '1973-10-14', 51, N'Doanh nhân', N'666 Đường Quang Trung, Đồng Nai', N'Kinh', N'Công ty TNHH Quốc Bảo'),  
('P010', N'Phan Khánh Linh', N'Nữ', '2005-03-03', 19, N'Sinh viên', N'777 Đường Phan Đình Phùng, Nghệ An', N'Gia Rai', N'Trường THPT Nghệ An'),  
('P011', N'Nguyễn Văn Hùng', N'Nam', '1970-12-21', 54, N'Kế toán', N'888 Đường Phạm Văn Đồng, Hà Nội', N'Kinh', N'Công ty Tài chính Hà Nội'),  
('P012', N'Trần Hoàng Nam', N'Nam', '1991-07-19', 33, N'Bác sĩ', N'999 Đường Trần Phú, Đà Nẵng', N'Chăm', N'Bệnh viện Trung ương Đà Nẵng'),  
('P013', N'Lê Thị Mai', N'Nữ', '1988-05-02', 36, N'Nhân viên văn phòng', N'222 Đường Nguyễn Văn Cừ, Hồ Chí Minh', N'Nùng', N'Công ty Phần mềm Sài Gòn'),  
('P014', N'Phạm Văn Cường', N'Nam', '1979-08-15', 45, N'Tài xế', N'333 Đường Hoàng Diệu, Hải Phòng', N'Kinh', N'Grab'),  
('P015', N'Đỗ Thanh Vân', N'Nữ', '1993-11-09', 31, N'Y sĩ', N'444 Đường Hùng Vương, Cần Thơ', N'Gia Rai', N'Trung tâm Y tế Cần Thơ'),  
('P016', N'Hoàng Minh Anh', N'Nam', '2002-02-27', 22, N'Sinh viên', N'555 Đường Nguyễn Chí Thanh, Huế', N'Kinh', N'Đại học Y Dược Huế'),  
('P017', N'Vũ Hoài Nam', N'Nam', '1996-09-18', 28, N'Công nhân', N'666 Đường Tôn Đức Thắng, Bình Dương', N'Kinh', N'KCN Sóng Thần'),  
('P018', N'Nguyễn Thị Hạnh', N'Nữ', '1980-06-30', 44, N'Kinh doanh', N'777 Đường Hàm Nghi, Đà Nẵng', N'Nùng', N'Công ty TNHH Minh Hạnh'),  
('P019', N'Trần Bảo An', N'Nam', '1975-04-05', 49, N'Luật sư', N'888 Đường Lý Thái Tổ, Hồ Chí Minh', N'Kinh', N'Văn phòng Luật sư HCM'),  
('P020', N'Ngô Thu Hằng', N'Nữ', '2003-01-12', 21, N'Sinh viên', N'999 Đường Lê Duẩn, Hà Nội', N'Gia Rai', N'Đại học Quốc gia Hà Nội'); 

INSERT INTO Department (ID, [name], [description], [location]) VALUES  
('D001', N'Khoa khám bệnh', N'Chuyên tiếp nhận và khám ban đầu cho bệnh nhân', N'Tầng 1 - Khu A'),  
('D002', N'Khoa Thần kinh', N'Chuyên điều trị các bệnh liên quan đến hệ thần kinh', N'Tầng 2 - Khu B'),  
('D003', N'Khoa Tim mạch', N'Chăm sóc và điều trị bệnh lý về tim mạch', N'Tầng 3 - Khu C'),  
('D004', N'Khoa Nhi', N'Điều trị các bệnh lý cho trẻ em', N'Tầng 4 - Khu A'),  
('D005', N'Khoa Cấp cứu', N'Tiếp nhận và điều trị bệnh nhân trong tình trạng khẩn cấp', N'Tầng 1 - Khu B');  

INSERT INTO Major (ID, [name]) VALUES  
('M001', N'Y đa khoa'),  
('M002', N'Điều dưỡng'),  
('M003', N'Dược'),  
('M004', N'Nha khoa'),  
('M005', N'Tâm lý học lâm sàng');

INSERT INTO Employee (ID, [name], [role], departmentID, majorID) VALUES  
('E001', N'Nguyễn Văn Minh', N'Bác sĩ', 'D001', 'M001'),  
('E002', N'Trần Hữu Nam', N'Y tá', 'D002', 'M001'),  
('E003', N'Lê Thị Hoa', N'Bác sĩ', 'D003', 'M001'),  
('E004', N'Phạm Minh Tuấn', N'Bác sĩ', 'D004', 'M001'),  
('E005', N'Đặng Thị Hạnh', N'Y tá', 'D005', 'M002'),  
('E006', N'Võ Mai Lan', N'Y tá', 'D001', 'M003'),  
('E007', N'Hoàng Văn Bình', N'Bác sĩ', 'D002', 'M004'),  
('E008', N'Nguyễn Thu Trang', N'Bác sĩ', 'D003', 'M005'),  
('E009', N'Lý Thành Công', N'Bác sĩ', 'D004', 'M001'),  
('E010', N'Bùi Đức An', N'Y tá', 'D005', 'M002'),  
('E011', N'Phan Thị Ngọc', N'Y tá', 'D001', 'M003'),  
('E012', N'Vũ Văn Dũng', N'Y tá', 'D002', 'M004'),  
('E013', N'Đỗ Thị Mai', N'Bác sĩ', 'D003', 'M005'),  
('E014', N'Lâm Quốc Bảo', N'Y tá', 'D004', 'M001'),  
('E015', N'Trịnh Hoàng Phúc', N'Y tá', 'D005', 'M002');   

INSERT INTO [Login] (employeeID, username, [password], loginRole) VALUES  
('E001', 'minhnve001', 'password123', N'Admin'),  
('E002', 'namthe002', 'securepass', N'Y tá'),  
('E003', 'hoalte003', 'mypassword', N'Bác sĩ'),  
('E004', 'tuanpme004', 'abc123', N'Bác sĩ'),  
('E005', 'hanhdte005', 'nursepass', N'Y tá'),  
('E006', 'lanvme006', 'randompass', N'Y tá'),  
('E007', 'binhvhe007', 'strongpass', N'Bác sĩ'),  
('E008', 'trangnte008', 'pass321', N'Bác sĩ'),  
('E009', 'conglte009', 'medicalpass', N'Bác sĩ'),  
('E010', 'anbde010', 'defaultpass', N'Y tá'),  
('E011', 'ngocpte011', 'testpass', N'Y tá'),  
('E012', 'dungvve012', 'hospital123', N'Y tá'),  
('E013', 'maidte013', 'doctorpass', N'Bác sĩ'),  
('E014', 'baolqe014', 'random123', N'Y tá'),  
('E015', 'phucthe015', 'secureme', N'Y tá');

INSERT INTO MonitoringAndTreatment VALUES 
('MAT001', '2025-03-01', 65.5, 120, 18, N'Kiểm tra huyết áp và theo dõi tim mạch', '2025-03-02', N'Chưa thực hiện', 'P005', 'E010'),
('MAT002', '2025-03-02', 70.2, 125, 20, N'Xét nghiệm máu tổng quát', '2025-03-03', N'Đã lấy mẫu máu', 'P012', 'E007'),
('MAT003', '2025-03-03', 55.8, 115, 16, N'Tiêm vaccine phòng cúm', '2025-03-04', N'Đã tiêm', 'P018', 'E002'),
('MAT004', '2025-03-04', 80.3, 130, 22, N'Chụp X-quang phổi', '2025-03-05', N'Chưa thực hiện', 'P003', 'E011'),
('MAT005', '2025-03-05', 60.7, 110, 19, N'Kiểm tra đường huyết', '2025-03-06', N'Đã kiểm tra, đường huyết ổn định', 'P009', 'E014'),
('MAT006', '2025-03-06', 72.5, 128, 21, N'Truyền dịch bổ sung', '2025-03-07', N'Đã truyền dịch', 'P014', 'E005'),
('MAT007', '2025-03-07', 67.4, 118, 17, N'Đo điện tim', '2025-03-08', N'Chưa thực hiện', 'P002', 'E013'),
('MAT008', '2025-03-08', 59.2, 112, 18, N'Kiểm tra chức năng gan', '2025-03-09', N'Đã kiểm tra', 'P017', 'E008'),
('MAT009', '2025-03-09', 75.1, 135, 23, N'Tư vấn dinh dưỡng', '2025-03-10', N'Đã tư vấn', 'P006', 'E001'),
('MAT010', '2025-03-10', 62.8, 119, 20, N'Khám sức khỏe tổng quát', '2025-03-11', N'Chưa thực hiện', 'P011', 'E006');
