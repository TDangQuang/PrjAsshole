INSERT INTO Department (ID, [name]) VALUES
('D001', N'Khoa Tim mạch'),
('D002', N'Khoa Thần kinh'),
('D003', N'Khoa Ung bướu'),
('D004', N'Khoa Nhi'),
('D005', N'Khoa Phụ sản'),
('D006', N'Khoa Da liễu'),
('D007', N'Khoa Mắt'),
('D008', N'Khoa Tiêu hóa'),
('D009', N'Khoa Cấp cứu'),
('D010', N'Khoa Ngoại tổng quát');

INSERT INTO Major (ID, [name]) VALUES
('M001', N'Y đa khoa'),
('M002', N'Điều dưỡng'),
('M003', N'Dược'),
('M004', N'Nha khoa'),
('M005', N'Y tế công cộng'),
('M006', N'Kỹ thuật xét nghiệm y học'),
('M007', N'Công nghệ chẩn đoán hình ảnh'),
('M008', N'Vật lý trị liệu'),
('M009', N'Liệu pháp hô hấp'),
('M010', N'Tâm lý học lâm sàng');

INSERT INTO ObjectForTestScan (ID, [name]) VALUES
('O000', N''),
('O001', N'Chụp CT - Não'),  
('O002', N'Chụp MRI - Cột sống'),  
('O003', N'Chụp X-Quang - Ngực'),  
('O004', N'Siêu âm - Bụng'),  
('O005', N'Xét nghiệm máu - Công thức máu toàn phần'),  
('O006', N'Điện tim - ECG'),  
('O007', N'Nội soi - Tiêu hóa'),  
('O008', N'Sinh thiết - Mẫu mô'),  
('O009', N'Chụp PET - Toàn thân'),  
('O010', N'Siêu âm Doppler - Dòng máu');

INSERT INTO Employee (ID, [name], [role], departmentID, majorID) VALUES
('E001', N'Nguyễn Văn Minh', N'Bác sĩ Tim mạch', 'D001', 'M001'),
('E002', N'Trần Hữu Nam', N'Bác sĩ Thần kinh', 'D002', 'M001'),
('E003', N'Lê Thị Hoa', N'Bác sĩ Ung bướu', 'D003', 'M001'),
('E004', N'Phạm Minh Tuấn', N'Bác sĩ Nhi khoa', 'D004', 'M001'),
('E005', N'Đặng Thị Hạnh', N'Bác sĩ Phụ khoa', 'D005', 'M005'),
('E006', N'Võ Mai Lan', N'Bác sĩ Da liễu', 'D006', 'M006'),
('E007', N'Hoàng Văn Bình', N'Bác sĩ Nhãn khoa', 'D007', 'M007'),
('E008', N'Nguyễn Thu Trang', N'Bác sĩ Tiêu hóa', 'D008', 'M008'),
('E009', N'Lý Thành Công', N'Bác sĩ Cấp cứu', 'D009', 'M009'),
('E010', N'Bùi Đức An', N'Bác sĩ Ngoại tổng quát', 'D010', 'M010'),
('E011', N'Phan Thị Ngọc', N'Y tá', 'D009', 'M002'),
('E012', N'Vũ Văn Dũng', N'Dược sĩ', 'D003', 'M003'),
('E013', N'Đỗ Thị Mai', N'Kỹ thuật viên xét nghiệm y học', 'D010', 'M006'),
('E014', N'Lâm Quốc Bảo', N'Kỹ thuật viên hình ảnh y học', 'D009', 'M007'),
('E015', N'Trịnh Hoàng Phúc', N'Chuyên viên vật lý trị liệu', 'D008', 'M008'),
('E016', N'Nguyễn Hải Long', N'Chuyên viên liệu pháp hô hấp', 'D005', 'M009'),
('E017', N'Đặng Văn Sơn', N'Chuyên gia dinh dưỡng', 'D004', 'M010'),
('E018', N'Lê Phương Linh', N'Quản lý thông tin y tế', 'D003', 'M005'),
('E019', N'Bùi Thanh Tùng', N'Bác sĩ Tim mạch', 'D001', 'M001'),
('E020', N'Trần Khánh Vy', N'Bác sĩ Thần kinh', 'D002', 'M001'),
('E021', N'Nguyễn Thị Hồng', N'Bác sĩ Ung bướu', 'D003', 'M001'),
('E022', N'Lê Văn Hậu', N'Bác sĩ Nhi khoa', 'D004', 'M001'),
('E023', N'Hoàng Thị Lan', N'Bác sĩ Phụ khoa', 'D005', 'M005'),
('E024', N'Võ Minh Hải', N'Bác sĩ Da liễu', 'D006', 'M006'),
('E025', N'Trần Thị Mỹ Dung', N'Bác sĩ Nhãn khoa', 'D007', 'M007'),
('E026', N'Đỗ Văn Lâm', N'Bác sĩ Tiêu hóa', 'D008', 'M008'),
('E027', N'Phạm Thu Hằng', N'Bác sĩ Cấp cứu', 'D009', 'M009'),
('E028', N'Ngô Thanh Phong', N'Bác sĩ Ngoại tổng quát', 'D010', 'M010'),
('E029', N'Nguyễn Hoàng Nam', N'Kỹ thuật viên xét nghiệm y học', 'D010', 'M006'),
('E030', N'Phạm Minh An', N'Chuyên viên vật lý trị liệu', 'D008', 'M008');

INSERT INTO Patient (ID, [name], gender, DOB, age, job, [address], nation, workplace, objectID) VALUES
('P001', N'Nguyễn Văn Minh', N'Nam', '1985-06-15', 39, N'Kỹ sư', N'123 Đường Lê Lợi, Hà Nội', N'Kinh', N'Công ty Tech Việt', 'O001'),
('P002', N'Trần Thị Lan', N'Nữ', '1992-09-23', 32, N'Giáo viên', N'456 Đường Nguyễn Trãi, Hồ Chí Minh', N'Tày', N'Trường Tiểu học HCM', 'O000'),
('P003', N'Phạm Hữu Nam', N'Nam', '1978-12-05', 46, N'Bác sĩ', N'789 Đường Hai Bà Trưng, Đà Nẵng', N'Nùng', N'Bệnh viện Trung ương ĐN', 'O003'),
('P004', N'Lê Mai Hoa', N'Nữ', '2000-04-11', 24, N'Sinh viên', N'101 Đường Phan Châu Trinh, Thái Bình', N'Mường', N'Đại học Y Dược Thái Bình', 'O004'),
('P005', N'Hoàng Văn Bình', N'Nam', '1965-11-30', 59, N'Đã nghỉ hưu', N'222 Đường Trần Hưng Đạo, Hải Phòng', N'Kinh', N'Không', 'O005'),
('P006', N'Võ Thu Hương', N'Nữ', '1989-08-17', 35, N'Y tá', N'333 Đường Nguyễn Huệ, Cần Thơ', N'Chăm', N'Bệnh viện Đa khoa Cần Thơ', 'O006'),
('P007', N'Đặng Văn Sơn', N'Nam', '1995-01-25', 29, N'Cảnh sát', N'444 Đường Lý Tự Trọng, Lâm Đồng', N'H''Mông', N'Công an Tỉnh Lâm Đồng', 'O000'),
('P008', N'Bùi Thị Ngọc', N'Nữ', '1982-07-08', 42, N'Luật sư', N'555 Đường Lê Thánh Tông, Quảng Ninh', N'Ê Đê', N'Văn phòng Luật sư Quảng Ninh', 'O008'),
('P009', N'Lâm Quốc Bảo', N'Nam', '1973-10-14', 51, N'Doanh nhân', N'666 Đường Quang Trung, Đồng Nai', N'Kinh', N'Công ty TNHH Quốc Bảo', 'O009'),
('P010', N'Phan Khánh Linh', N'Nữ', '2005-03-03', 19, N'Sinh viên', N'777 Đường Phan Đình Phùng, Nghệ An', N'Gia Rai', N'Trường THPT Nghệ An', 'O000'),
('P011', N'Nguyễn Văn Hùng', N'Nam', '1970-12-21', 54, N'Kế toán', N'888 Đường Phạm Văn Đồng, Hà Nội', N'Kinh', N'Công ty Tài chính Hà Nội', 'O001'),
('P012', N'Trần Hoàng Nam', N'Nam', '1991-07-19', 33, N'Bác sĩ', N'999 Đường Trần Phú, Đà Nẵng', N'Chăm', N'Bệnh viện Trung ương Đà Nẵng', 'O002'),
('P013', N'Lê Thị Mai', N'Nữ', '1988-05-02', 36, N'Nhân viên văn phòng', N'222 Đường Nguyễn Văn Cừ, Hồ Chí Minh', N'Nùng', N'Công ty Phần mềm Sài Gòn', 'O003'),
('P014', N'Phạm Văn Cường', N'Nam', '1979-08-15', 45, N'Tài xế', N'333 Đường Hoàng Diệu, Hải Phòng', N'Kinh', N'Grab', 'O000'),
('P015', N'Đỗ Thanh Vân', N'Nữ', '1993-11-09', 31, N'Y sĩ', N'444 Đường Hùng Vương, Cần Thơ', N'Gia Rai', N'Trung tâm Y tế Cần Thơ', 'O005'),
('P016', N'Hoàng Minh Anh', N'Nam', '2002-02-27', 22, N'Sinh viên', N'555 Đường Nguyễn Chí Thanh, Huế', N'Kinh', N'Đại học Y Dược Huế', 'O006'),
('P017', N'Vũ Hoài Nam', N'Nam', '1996-09-18', 28, N'Công nhân', N'666 Đường Tôn Đức Thắng, Bình Dương', N'Kinh', N'KCN Sóng Thần', 'O007'),
('P018', N'Nguyễn Thị Hạnh', N'Nữ', '1980-06-30', 44, N'Kinh doanh', N'777 Đường Hàm Nghi, Đà Nẵng', N'Nùng', N'Công ty TNHH Minh Hạnh', 'O000'),
('P019', N'Trần Bảo An', N'Nam', '1975-04-05', 49, N'Luật sư', N'888 Đường Lý Thái Tổ, Hồ Chí Minh', N'Kinh', N'Văn phòng Luật sư HCM', 'O009'),
('P020', N'Ngô Thu Hằng', N'Nữ', '2003-01-12', 21, N'Sinh viên', N'999 Đường Lê Duẩn, Hà Nội', N'Gia Rai', N'Đại học Quốc gia Hà Nội', 'O010'),
('P021', N'Bùi Văn Đức', N'Nam', '1984-03-22', 40, N'Giáo viên', N'123 Đường Bà Triệu, Huế', N'Kinh', N'Trường THPT Huế', 'O001'),
('P022', N'Nguyễn Minh Hiếu', N'Nam', '1998-07-14', 26, N'Lập trình viên', N'456 Đường Võ Văn Kiệt, Hồ Chí Minh', N'Chăm', N'Công ty Phần mềm Việt', 'O002'),
('P023', N'Lê Phương Anh', N'Nữ', '1990-10-30', 34, N'Bác sĩ', N'789 Đường Nguyễn Hữu Cảnh, Đà Nẵng', N'Nùng', N'Bệnh viện Đà Nẵng', 'O000'),
('P024', N'Đỗ Hải Nam', N'Nam', '1986-05-17', 38, N'Kinh doanh', N'101 Đường Hàng Bông, Hà Nội', N'Kinh', N'Công ty TNHH Hải Nam', 'O004'),
('P025', N'Phạm Văn An', N'Nam', '2000-09-09', 24, N'Sinh viên', N'222 Đường Nguyễn Thái Học, Bình Định', N'Kinh', N'Đại học Bình Định', 'O005'),
('P026', N'Nguyễn Thị Lệ', N'Nữ', '1985-04-20', 39, N'Nhân viên kế toán', N'234 Đường Lạc Long Quân, Hà Nội', N'Kinh', N'Công ty Tài chính ABC', 'O000'),
('P027', N'Trần Quốc Bảo', N'Nam', '1990-11-15', 34, N'Kỹ sư phần mềm', N'567 Đường Trần Quang Khải, Hồ Chí Minh', N'Nùng', N'Công ty IT Việt Nam', 'O000'),
('P028', N'Lê Minh Đức', N'Nam', '1977-08-29', 47, N'Tài xế', N'789 Đường Bạch Đằng, Đà Nẵng', N'Kinh', N'Grab', 'O000'),
('P029', N'Phạm Thị Dung', N'Nữ', '2001-06-07', 23, N'Sinh viên', N'345 Đường Hoàng Diệu, Hải Phòng', N'Kinh', N'Đại học Hải Phòng', 'O000'),
('P030', N'Vũ Thanh Long', N'Nam', '1993-10-12', 31, N'Công nhân', N'123 Đường Nguyễn Văn Linh, Bình Dương', N'Chăm', N'KCN Sóng Thần', 'O000'),
('P031', N'Đỗ Thị Thu', N'Nữ', '1989-12-03', 35, N'Nhân viên bán hàng', N'456 Đường Tôn Đức Thắng, Hồ Chí Minh', N'Nùng', N'Siêu thị Big C', 'O000'),
('P032', N'Nguyễn Hữu Phước', N'Nam', '1972-03-21', 52, N'Bác sĩ', N'567 Đường Nguyễn Thị Minh Khai, Cần Thơ', N'Kinh', N'Bệnh viện Đa khoa Cần Thơ', 'O000'),
('P033', N'Trần Thị Hồng', N'Nữ', '1980-05-14', 44, N'Giáo viên', N'678 Đường Hai Bà Trưng, Hà Nội', N'Gia Rai', N'Trường Tiểu học Hà Nội', 'O000'),
('P034', N'Hoàng Văn An', N'Nam', '1995-07-19', 29, N'Kỹ thuật viên', N'789 Đường Lê Hồng Phong, Hải Dương', N'Kinh', N'Công ty TNHH An Phát', 'O000'),
('P035', N'Bùi Thị Trang', N'Nữ', '2004-09-30', 20, N'Sinh viên', N'123 Đường Trường Chinh, Nghệ An', N'Ê Đê', N'Đại học Vinh', 'O000'),
('P036', N'Ngô Quang Huy', N'Nam', '1998-02-14', 26, N'Nhân viên IT', N'567 Đường Nguyễn Trãi, Hồ Chí Minh', N'Kinh', N'Công ty Phần mềm Hồ Chí Minh', 'O000'),
('P037', N'Phạm Văn Hòa', N'Nam', '1976-06-25', 48, N'Chủ cửa hàng', N'234 Đường Trần Hưng Đạo, Hà Nội', N'Chăm', N'Cửa hàng tạp hóa Hòa Bình', 'O000'),
('P038', N'Trịnh Thị Ngọc', N'Nữ', '1983-08-08', 41, N'Nhân viên văn phòng', N'678 Đường Lý Thường Kiệt, Đà Nẵng', N'Kinh', N'Công ty Xuất nhập khẩu Đà Nẵng', 'O000'),
('P039', N'Nguyễn Văn Thành', N'Nam', '1991-11-05', 33, N'Cảnh sát', N'345 Đường Hoàng Văn Thụ, Hồ Chí Minh', N'Nùng', N'Công an TP Hồ Chí Minh', 'O000'),
('P040', N'Đặng Minh Châu', N'Nữ', '1997-12-01', 27, N'Y tá', N'456 Đường Nguyễn Văn Cừ, Hà Nội', N'Kinh', N'Bệnh viện Bạch Mai', 'O000'),
('P041', N'Lâm Văn Hùng', N'Nam', '1987-03-09', 37, N'Tài xế xe tải', N'678 Đường Phan Văn Hớn, Bình Dương', N'Kinh', N'Công ty Vận tải Nam Hùng', 'O000'),
('P042', N'Bùi Thu Hằng', N'Nữ', '1992-05-22', 32, N'Nhân viên văn phòng', N'789 Đường Lê Văn Sỹ, Hồ Chí Minh', N'Gia Rai', N'Công ty TNHH Gia Hòa', 'O000'),
('P043', N'Ngô Văn Quý', N'Nam', '1984-10-15', 40, N'Kinh doanh', N'234 Đường Điện Biên Phủ, Đà Nẵng', N'Kinh', N'Công ty Thương mại Đà Nẵng', 'O000'),
('P044', N'Phan Thị Kim', N'Nữ', '1996-08-28', 28, N'Kỹ sư hóa học', N'345 Đường Lạc Long Quân, Hà Nội', N'Nùng', N'Công ty Hóa chất Hà Nội', 'O000'),
('P045', N'Trần Văn Phúc', N'Nam', '1999-07-17', 25, N'Công nhân', N'567 Đường Nguyễn Văn Bảo, Hồ Chí Minh', N'Kinh', N'Nhà máy Sản xuất Linh kiện', 'O000');

INSERT INTO Disease (ID, [name]) VALUES  
('D001', N'Tăng huyết áp'),  
('D002', N'Bệnh tiểu đường'),  
('D003', N'Viêm phổi'),  
('D004', N'Bệnh phổi tắc nghẽn mạn tính (COPD)'),  
('D005', N'Hen suyễn'),  
('D006', N'Lao phổi'),  
('D007', N'Bệnh động mạch vành'),  
('D008', N'Đột quỵ'),  
('D009', N'Bệnh Alzheimer'),  
('D010', N'Bệnh Parkinson'),  
('D011', N'Ung thư phổi'),  
('D012', N'Ung thư vú'),  
('D013', N'Ung thư đại trực tràng'),  
('D014', N'Suy thận'),  
('D015', N'Xơ gan'),  
('D016', N'Bệnh loét dạ dày tá tràng'),  
('D017', N'Viêm gan B'),  
('D018', N'Sốt xuất huyết'),  
('D019', N'Sốt rét'),  
('D020', N'COVID-19');  

INSERT INTO Medicine (ID, [name], unit, origin) VALUES  
('M001', N'Paracetamol', N'Viên nén', N'Mỹ'),  
('M002', N'Amoxicillin', N'Viên nang', N'Anh'),  
('M003', N'Ibuprofen', N'Viên nén', N'Đức'),  
('M004', N'Metformin', N'Viên nén', N'Ấn Độ'),  
('M005', N'Omeprazole', N'Viên nang', N'Pháp'),  
('M006', N'Salbutamol', N'Bình xịt', N'Canada'),  
('M007', N'Losartan', N'Viên nén', N'Nhật Bản'),  
('M008', N'Aspirin', N'Viên nén', N'Thụy Sĩ'),  
('M009', N'Ciprofloxacin', N'Viên nén', N'Trung Quốc'),  
('M010', N'Insulin', N'Tiêm', N'Đan Mạch'),  
('M011', N'Prednisolone', N'Viên nén', N'Úc'),  
('M012', N'Diazepam', N'Viên nén', N'Tây Ban Nha'),  
('M013', N'Ranitidine', N'Viên nén', N'Ý'),  
('M014', N'Azithromycin', N'Viên nang', N'Ấn Độ'),  
('M015', N'Dextromethorphan', N'Siro', N'Mỹ'),  
('M016', N'Cetirizine', N'Viên nén', N'Đức'),  
('M017', N'Clopidogrel', N'Viên nén', N'Pháp'),  
('M018', N'Warfarin', N'Viên nén', N'Anh'),  
('M019', N'Hydrochlorothiazide', N'Viên nén', N'Canada'),  
('M020', N'Fluconazole', N'Viên nang', N'Brazil');  

INSERT INTO [Service] (ID, [name], price) VALUES  
('S001', N'Khám bệnh tổng quát', 50.00),  
('S002', N'Khám chuyên khoa', 100.00),  
('S003', N'Xét nghiệm máu - Công thức máu toàn phần', 30.00),  
('S004', N'Chụp X-quang - Ngực', 80.00),  
('S005', N'Chụp MRI - Não', 500.00),  
('S006', N'Chụp CT - Bụng', 400.00),  
('S007', N'Siêu âm - Thai kỳ', 70.00),  
('S008', N'Điện tâm đồ (ECG)', 60.00),  
('S009', N'Nội soi - Tiêu hóa', 300.00),  
('S010', N'Sinh thiết - Mẫu mô', 250.00),  
('S011', N'Buổi vật lý trị liệu', 75.00),  
('S012', N'Tiêm vắc xin - Cúm', 25.00),  
('S013', N'Khám cấp cứu', 200.00),  
('S014', N'Nhập viện (tính theo ngày)', 350.00),  
('S015', N'Phẫu thuật - Cắt ruột thừa', 2000.00),  
('S016', N'Buổi hóa trị', 1500.00),  
('S017', N'Chạy thận nhân tạo', 250.00),  
('S018', N'Tư vấn sức khỏe tâm thần', 120.00),  
('S019', N'Khám mắt - Chuyên khoa mắt', 90.00),  
('S020', N'Vệ sinh răng miệng', 60.00);  

INSERT INTO Bed (ID, room, departmentID) VALUES
(1, 'R101', 'D001'), (2, 'R101', 'D001'), (3, 'R102', 'D001'), (4, 'R102', 'D001'),
(5, 'R103', 'D002'), (6, 'R103', 'D002'), (7, 'R104', 'D002'), (8, 'R104', 'D002'),
(9, 'R105', 'D003'), (10, 'R105', 'D003'), (11, 'R106', 'D003'), (12, 'R106', 'D003'),
(13, 'R107', 'D004'), (14, 'R107', 'D004'), (15, 'R108', 'D004'), (16, 'R108', 'D004'),
(17, 'R109', 'D005'), (18, 'R109', 'D005'), (19, 'R110', 'D005'), (20, 'R110', 'D005'),
(21, 'R111', 'D006'), (22, 'R111', 'D006'), (23, 'R112', 'D006'), (24, 'R112', 'D006'),
(25, 'R113', 'D007'), (26, 'R113', 'D007'), (27, 'R114', 'D007'), (28, 'R114', 'D007'),
(29, 'R115', 'D008'), (30, 'R115', 'D008'), (31, 'R116', 'D008'), (32, 'R116', 'D008'),
(33, 'R117', 'D009'), (34, 'R117', 'D009'), (35, 'R118', 'D009'), (36, 'R118', 'D009'),
(37, 'R119', 'D010'), (38, 'R119', 'D010'), (39, 'R120', 'D010'), (40, 'R120', 'D010');  

INSERT INTO MedicalFacility (ID, [name], [address]) VALUES  
('MF001', N'Bệnh viện Bạch Mai', N'78 Giải Phóng, Đống Đa, Hà Nội'),  
('MF002', N'Bệnh viện Chợ Rẫy', N'201B Nguyễn Chí Thanh, Quận 5, TP. Hồ Chí Minh'),  
('MF003', N'Bệnh viện Trung ương Huế', N'16 Lê Lợi, Thành phố Huế, Thừa Thiên Huế'),  
('MF004', N'Bệnh viện Việt Đức', N'40 Tràng Thi, Hoàn Kiếm, Hà Nội'),  
('MF005', N'Bệnh viện 108', N'1 Trần Hưng Đạo, Hai Bà Trưng, Hà Nội'),  
('MF006', N'Bệnh viện Đại học Y Dược TP.HCM', N'215 Hồng Bàng, Quận 5, TP. Hồ Chí Minh'),  
('MF007', N'Bệnh viện Nhi Trung ương', N'18/879 La Thành, Đống Đa, Hà Nội'),  
('MF008', N'Bệnh viện K', N'43 Quán Sứ, Hoàn Kiếm, Hà Nội'),  
('MF009', N'Bệnh viện Phụ sản Trung ương', N'43 Tràng Thi, Hoàn Kiếm, Hà Nội'),  
('MF010', N'Bệnh viện Đà Nẵng', N'124 Hải Phòng, Quận Hải Châu, Đà Nẵng');  

INSERT INTO Clinic (ID, [name]) VALUES  
('C001', N'Phòng khám Nội tổng hợp'),  
('C002', N'Phòng khám Ngoại tổng quát'),  
('C003', N'Phòng khám Nhi khoa'),  
('C004', N'Phòng khám Sản phụ khoa'),  
('C005', N'Phòng khám Tim mạch'),  
('C006', N'Phòng khám Hô hấp'),  
('C007', N'Phòng khám Tiêu hóa - Gan mật'),  
('C008', N'Phòng khám Mắt'),  
('C009', N'Phòng khám Tai Mũi Họng'),  
('C010', N'Phòng khám Cơ xương khớp');    

INSERT INTO ExaminationLevel (ID, [name]) VALUES  
('EL001', N'Khám tổng quát'),  
('EL002', N'Khám chuyên khoa'),  
('EL003', N'Khám cấp cứu'),  
('EL004', N'Khám tầm soát sức khỏe'),  
('EL005', N'Khám theo yêu cầu'),  
('EL006', N'Khám sức khỏe định kỳ'),  
('EL007', N'Khám sức khỏe lao động'),  
('EL008', N'Khám bảo hiểm y tế'),  
('EL009', N'Khám xuất viện'),  
('EL010', N'Khám hội chẩn chuyên sâu');  

INSERT INTO Surgery (ID, [name], [level]) VALUES  
('S001', N'Phẫu thuật cắt ruột thừa', N'Tiểu phẫu'),  
('S002', N'Phẫu thuật cắt amidan', N'Tiểu phẫu'),  
('S003', N'Phẫu thuật trĩ', N'Tiểu phẫu'),  
('S004', N'Phẫu thuật nội soi cắt túi mật', N'Trung phẫu'),  
('S005', N'Phẫu thuật sỏi thận', N'Trung phẫu'),  
('S006', N'Phẫu thuật cắt u xơ tử cung', N'Trung phẫu'),  
('S007', N'Phẫu thuật thay khớp háng', N'Đại phẫu'),  
('S008', N'Phẫu thuật thay khớp gối', N'Đại phẫu'),  
('S009', N'Phẫu thuật ghép gan', N'Đại phẫu phức tạp'),  
('S010', N'Phẫu thuật ghép tim', N'Đại phẫu phức tạp');  

INSERT INTO MedicalRecord (ID, [name]) VALUES  
('MR001', N'Hồ sơ khám bệnh tổng quát'),  
('MR002', N'Hồ sơ khám chuyên khoa'),  
('MR003', N'Hồ sơ xét nghiệm máu'),  
('MR004', N'Hồ sơ chụp X-quang'),  
('MR005', N'Hồ sơ chụp MRI'),  
('MR006', N'Hồ sơ nội soi tiêu hóa'),  
('MR007', N'Hồ sơ phẫu thuật'),  
('MR008', N'Hồ sơ theo dõi thai kỳ'),  
('MR009', N'Hồ sơ điều trị ung thư'),  
('MR010', N'Hồ sơ bệnh án tâm thần');  

INSERT INTO MedicalRecordBook (ID, medicalRecordID) VALUES  
('MRB001', 'MR001'), -- Hồ sơ khám bệnh tổng quát  
('MRB002', 'MR002'), -- Hồ sơ khám chuyên khoa  
('MRB003', 'MR003'), -- Hồ sơ xét nghiệm máu  
('MRB004', 'MR004'), -- Hồ sơ chụp X-quang  
('MRB005', 'MR005'), -- Hồ sơ chụp MRI  
('MRB006', 'MR006'), -- Hồ sơ nội soi tiêu hóa  
('MRB007', 'MR007'), -- Hồ sơ phẫu thuật  
('MRB008', 'MR008'), -- Hồ sơ theo dõi thai kỳ  
('MRB009', 'MR009'), -- Hồ sơ điều trị ung thư  
('MRB010', 'MR010'); -- Hồ sơ bệnh án tâm thần  

INSERT INTO PatientFamily (ID, [name], [address], phoneNum, patientID) VALUES  
('F001', N'Nguyễn Văn An', N'12 Nguyễn Trãi, Hà Nội', '09123456789', 'P001'),  
('F002', N'Trần Thị Mai', N'34 Lê Lợi, Hồ Chí Minh', '09876543210', 'P002'),  
('F003', N'Phạm Hữu Minh', N'56 Trần Hưng Đạo, Đà Nẵng', '09345678901', 'P003'),  
('F004', N'Lê Thị Hồng', N'78 Hai Bà Trưng, Hải Phòng', '09765432109', 'P004'),  
('F005', N'Võ Thành Công', N'90 Phan Chu Trinh, Cần Thơ', '09654321098', 'P005'),  
('F006', N'Hồ Thị Lan', N'102 Quang Trung, Thái Bình', '09543210987', 'P006'),  
('F007', N'Đỗ Văn Hưng', N'110 Lý Thường Kiệt, Huế', '09432109876', 'P007'),  
('F008', N'Bùi Thị Yến', N'125 Nguyễn Huệ, Nha Trang', '09321098765', 'P008'),  
('F009', N'Tạ Văn Sơn', N'130 Võ Nguyên Giáp, Đắk Lắk', '09210987654', 'P009'),  
('F010', N'Ngô Thị Hạnh', N'150 Lê Quý Đôn, Bình Dương', '09109876543', 'P010'),  
('F011', N'Hoàng Văn Hùng', N'12 Lý Tự Trọng, Quảng Ninh', '09011223344', 'P011'),  
('F012', N'Nguyễn Thị Dung', N'88 Trần Phú, Hà Tĩnh', '09112233445', 'P012'),  
('F013', N'Lê Hữu Tài', N'99 Đinh Tiên Hoàng, Bắc Giang', '09223344556', 'P013'),  
('F014', N'Phạm Thanh Bình', N'77 Nguyễn Du, Nam Định', '09334455667', 'P014'),  
('F015', N'Vũ Văn Quang', N'55 Lạc Long Quân, Hòa Bình', '09445566778', 'P015'),  
('F016', N'Bùi Thị Nhàn', N'22 Phan Đình Phùng, Sơn La', '09556677889', 'P016'),  
('F017', N'Đặng Quốc Huy', N'44 Bạch Đằng, Đồng Nai', '09667788990', 'P017'),  
('F018', N'Nguyễn Văn Khánh', N'66 Nguyễn Văn Cừ, Lạng Sơn', '09778899001', 'P018'),  
('F019', N'Lâm Hồng Phúc', N'11 Trường Chinh, Quảng Bình', '09889900112', 'P019'),  
('F020', N'Phan Minh Tuấn', N'33 Ngô Gia Tự, Bình Phước', '09990011223', 'P020'),
('F021', N'Trần Văn Hoàng', N'21 Lê Lợi, Thanh Hóa', '0900111222', 'P021'),  
('F022', N'Nguyễn Thị Hạnh', N'32 Nguyễn Văn Linh, Quảng Ngãi', '0911223344', 'P022'),  
('F023', N'Lê Minh Tuấn', N'15 Trần Phú, Hà Nội', '0922334455', 'P023'),  
('F024', N'Phạm Văn Bình', N'98 Lý Thường Kiệt, Đồng Nai', '0933445566', 'P024'),  
('F025', N'Bùi Thị Ngọc', N'76 Nguyễn Trãi, Hồ Chí Minh', '0944556677', 'P025'),  
('F026', N'Hoàng Văn Sơn', N'11 Hai Bà Trưng, Lâm Đồng', '0955667788', 'P026'),  
('F027', N'Đặng Thị Hoa', N'44 Đinh Bộ Lĩnh, Nghệ An', '0966778899', 'P027'),  
('F028', N'Vũ Quốc Huy', N'99 Trường Chinh, Tây Ninh', '0977889900', 'P028'),  
('F029', N'Nguyễn Thị Yến', N'12 Nguyễn Huệ, Hải Phòng', '0988990011', 'P029'),  
('F030', N'Phan Văn Hải', N'88 Quang Trung, Thừa Thiên Huế', '0999001122', 'P030'),  
('F031', N'Trần Hữu Nam', N'64 Hoàng Văn Thụ, Đà Nẵng', '0910112233', 'P031'),  
('F032', N'Lâm Thị Nhung', N'34 Nguyễn Văn Cừ, Bến Tre', '0921223344', 'P032'),  
('F033', N'Đỗ Văn Thành', N'21 Phan Chu Trinh, Hòa Bình', '0932334455', 'P033'),  
('F034', N'Bùi Minh An', N'77 Võ Văn Kiệt, Cà Mau', '0943445566', 'P034'),  
('F035', N'Hoàng Thanh Hùng', N'54 Bạch Đằng, Bình Thuận', '0954556677', 'P035'),  
('F036', N'Ngô Thị Dung', N'67 Nguyễn Công Trứ, Vũng Tàu', '0965667788', 'P036'),  
('F037', N'Võ Văn Hòa', N'101 Cách Mạng Tháng 8, Bình Dương', '0976778899', 'P037'),  
('F038', N'Phạm Thị Lan', N'44 Pasteur, Kiên Giang', '0987889900', 'P038'),  
('F039', N'Trịnh Quốc Tuấn', N'19 Lê Quý Đôn, Bắc Ninh', '0998990011', 'P039'),  
('F040', N'Nguyễn Hải Đăng', N'29 Lê Đại Hành, Đắk Lắk', '0919001122', 'P040'),  
('F041', N'Trần Thu Hà', N'55 Trần Nhật Duật, Sơn La', '0920112233', 'P041'),  
('F042', N'Lê Văn Kiên', N'77 Hùng Vương, Nam Định', '0931223344', 'P042'),  
('F043', N'Bùi Thị Thanh', N'89 Phan Đình Phùng, Phú Yên', '0942334455', 'P043'),  
('F044', N'Hoàng Đức Minh', N'43 Tôn Đức Thắng, Kon Tum', '0953445566', 'P044'),  
('F045', N'Đặng Ngọc Bích', N'31 Lê Văn Sỹ, An Giang', '0964556677', 'P045');  


INSERT INTO HealthInsuranceCard (cardNum, patientID, issueDate, expirationDate) VALUES  
  ('BHXH20240000001', 'P001', '2024-01-15', '2029-01-15'),  
  ('BHXH20240000002', 'P002', '2023-12-10', '2028-12-10'),  
  ('BHXH20240000003', 'P003', '2022-05-20', '2027-05-20'),  
  ('BHXH20240000004', 'P004', '2024-03-05', '2029-03-05'),  
  ('BHXH20240000005', 'P005', '2021-09-30', '2026-09-30'),  
  ('BHXH20240000006', 'P006', '2023-07-12', '2028-07-12'),  
  ('BHXH20240000007', 'P007', '2020-11-25', '2025-11-25'),  
  ('BHXH20240000008', 'P008', '2024-02-18', '2029-02-18'),  
  ('BHXH20240000009', 'P009', '2019-06-07', '2024-06-07'),  
  ('BHXH20240000010', 'P010', '2023-10-21', '2028-10-21'),  
  ('BHXH20240000011', 'P011', '2022-09-05', '2027-09-05'),  
  ('BHXH20240000012', 'P012', '2021-04-14', '2026-04-14'),  
  ('BHXH20240000013', 'P013', '2023-08-22', '2028-08-22'),  
  ('BHXH20240000014', 'P014', '2020-12-01', '2025-12-01'),  
  ('BHXH20240000015', 'P015', '2024-06-09', '2029-06-09'),  
  ('BHXH20240000016', 'P016', '2023-03-15', '2028-03-15'),  
  ('BHXH20240000017', 'P017', '2022-07-30', '2027-07-30'),  
  ('BHXH20240000018', 'P018', '2021-05-25', '2026-05-25'),  
  ('BHXH20240000019', 'P019', '2020-11-10', '2025-11-10'),  
  ('BHXH20240000020', 'P020', '2024-04-03', '2029-04-03'),  
  ('BHXH20240000021', 'P021', '2023-01-18', '2028-01-18'),  
  ('BHXH20240000022', 'P022', '2022-06-12', '2027-06-12'),  
  ('BHXH20240000023', 'P023', '2021-09-27', '2026-09-27'),  
  ('BHXH20240000024', 'P024', '2020-03-07', '2025-03-07'),  
  ('BHXH20240000025', 'P025', '2024-05-14', '2029-05-14'),  
  ('BHXH20240000026', 'P026', '2023-02-23', '2028-02-23'),  
  ('BHXH20240000027', 'P027', '2022-10-10', '2027-10-10'),  
  ('BHXH20240000028', 'P028', '2021-07-19', '2026-07-19'),  
  ('BHXH20240000029', 'P029', '2020-09-30', '2025-09-30'),  
  ('BHXH20240000030', 'P030', '2024-02-15', '2029-02-15'),  
  ('BHXH20240000031', 'P031', '2023-05-20', '2028-05-20'),  
  ('BHXH20240000032', 'P032', '2022-03-28', '2027-03-28'),  
  ('BHXH20240000033', 'P033', '2021-12-09', '2026-12-09'),  
  ('BHXH20240000034', 'P034', '2020-08-21', '2025-08-21'),  
  ('BHXH20240000035', 'P035', '2024-01-17', '2029-01-17'),  
  ('BHXH20240000036', 'P036', '2023-06-30', '2028-06-30'),  
  ('BHXH20240000037', 'P037', '2022-04-26', '2027-04-26'),  
  ('BHXH20240000038', 'P038', '2021-07-14', '2026-07-14'),  
  ('BHXH20240000039', 'P039', '2020-10-09', '2025-10-09'),  
  ('BHXH20240000040', 'P040', '2024-03-21', '2029-03-21'),  
  ('BHXH20240000041', 'P041', '2023-09-13', '2028-09-13'),  
  ('BHXH20240000042', 'P042', '2022-11-05', '2027-11-05'),  
  ('BHXH20240000043', 'P043', '2021-02-07', '2026-02-07'),  
  ('BHXH20240000044', 'P044', '2020-05-29', '2025-05-29'),  
  ('BHXH20240000045', 'P045', '2024-07-08', '2029-07-08');  
