INSERT INTO Department (ID, [name]) VALUES
('D001', N'Khoa Tim mạch'),
('D002', N'Khoa Thần kinh'),
('D003', N'Khoa Ung bướu'),
('D004', N'Khoa Nhi'),
('D005', N'Khoa Chấn thương chỉnh hình'),
('D006', N'Khoa Phụ sản'),
('D007', N'Khoa Da liễu'),
('D008', N'Khoa Mắt'),
('D009', N'Khoa Chẩn đoán hình ảnh'),
('D010', N'Khoa Tiết niệu'),
('D011', N'Khoa Gây mê hồi sức'),
('D012', N'Khoa Tiêu hóa'),
('D013', N'Khoa Nội tiết'),
('D014', N'Khoa Thận - Tiết niệu'),
('D015', N'Khoa Hô hấp'),
('D016', N'Khoa Huyết học'),
('D017', N'Khoa Tâm thần'),
('D018', N'Khoa Cấp cứu'),
('D019', N'Khoa Ngoại tổng quát'),
('D020', N'Khoa Giải phẫu bệnh');

INSERT INTO Major (ID, [name]) VALUES
('M001', N'Y đa khoa'),
('M002', N'Điều dưỡng'),
('M003', N'Dược'),
('M004', N'Nha khoa'),
('M005', N'Y tế công cộng'),
('M006', N'Kỹ thuật xét nghiệm y học'),
('M007', N'Công nghệ chẩn đoán hình ảnh'),
('M008', N'Vật lý trị liệu'),
('M009', N'Trị liệu nghề nghiệp'),
('M010', N'Chẩn đoán hình ảnh y học'),
('M011', N'Khoa học y sinh'),
('M012', N'Công nghệ gây mê hồi sức'),
('M013', N'Liệu pháp hô hấp'),
('M014', N'Dinh dưỡng và tiết chế'),
('M015', N'Quản lý thông tin y tế'),
('M016', N'Cấp cứu ngoại viện'),
('M017', N'Công nghệ sinh học y học'),
('M018', N'Khúc xạ nhãn khoa'),
('M019', N'Tâm lý học lâm sàng'),
('M020', N'Thú y');

INSERT INTO ObjectForTestScan (ID, [name]) VALUES  
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
('E005', N'Đặng Thị Hạnh', N'Bác sĩ Chỉnh hình', 'D005', 'M001'),
('E006', N'Võ Mai Lan', N'Bác sĩ Phụ khoa', 'D006', 'M001'),
('E007', N'Hoàng Văn Bình', N'Bác sĩ Da liễu', 'D007', 'M001'),
('E008', N'Nguyễn Thu Trang', N'Bác sĩ Nhãn khoa', 'D008', 'M018'),
('E009', N'Lý Thành Công', N'Bác sĩ Chẩn đoán hình ảnh', 'D009', 'M010'),
('E010', N'Bùi Đức An', N'Bác sĩ Tiết niệu', 'D010', 'M001'),
('E011', N'Phan Thị Ngọc', N'Bác sĩ Gây mê hồi sức', 'D011', 'M012'),
('E012', N'Vũ Văn Dũng', N'Bác sĩ Tiêu hóa', 'D012', 'M001'),
('E013', N'Đỗ Thị Mai', N'Bác sĩ Nội tiết', 'D013', 'M001'),
('E014', N'Lâm Quốc Bảo', N'Bác sĩ Thận - Tiết niệu', 'D014', 'M001'),
('E015', N'Trịnh Hoàng Phúc', N'Bác sĩ Hô hấp', 'D015', 'M001'),
('E016', N'Nguyễn Hải Long', N'Bác sĩ Huyết học', 'D016', 'M001'),
('E017', N'Đặng Văn Sơn', N'Bác sĩ Tâm thần', 'D017', 'M019'),
('E018', N'Lê Phương Linh', N'Bác sĩ Cấp cứu', 'D018', 'M001'),
('E019', N'Bùi Thanh Tùng', N'Bác sĩ Ngoại khoa', 'D019', 'M001'),
('E020', N'Trần Khánh Vy', N'Bác sĩ Giải phẫu bệnh', 'D020', 'M001'),
('E021', N'Nguyễn Thị Hồng', N'Y tá', 'D018', 'M002'),
('E022', N'Lê Văn Hậu', N'Dược sĩ', NULL, 'M003'),
('E023', N'Hoàng Thị Lan', N'Kỹ thuật viên xét nghiệm y học', 'D020', 'M006'),
('E024', N'Võ Minh Hải', N'Kỹ thuật viên hình ảnh y học', 'D009', 'M007'),
('E025', N'Trần Thị Mỹ Dung', N'Chuyên viên vật lý trị liệu', NULL, 'M008'),
('E026', N'Đỗ Văn Lâm', N'Chuyên viên liệu pháp hô hấp', 'D015', 'M013'),
('E027', N'Phạm Thu Hằng', N'Chuyên gia dinh dưỡng', NULL, 'M014'),
('E028', N'Ngô Thanh Phong', N'Quản lý thông tin y tế', NULL, 'M015');


INSERT INTO [Login] (username, password) VALUES
('E001', N'NguyenVanMinh123!'),
('E002', N'TranHuuNam456@'),
('E003', N'LeThiHoa789#'),
('E004', N'PhamMinhTuan321$'),
('E005', N'DangThiHanh654%'),
('E006', N'VoMaiLan987^'),
('E007', N'HoangVanBinh159&'),
('E008', N'NguyenThuTrang753*'),
('E009', N'LyThanhCong852('),
('E010', N'BuiDucAn741)'),
('E011', N'PhanThiNgoc963_'),
('E012', N'VuVanDung147-'),
('E013', N'DoThiMai258='),
('E014', N'LamQuocBao369+'),
('E015', N'TrinhHoangPhuc753?'),
('E016', N'NguyenHaiLong852>'),
('E017', N'DangVanSon159<'),
('E018', N'LePhuongLinh789!'),
('E019', N'BuiThanhTung001@'),
('E020', N'TranKhanhVy222#'),
('E021', N'NguyenThiHong333$'),
('E022', N'LeVanHau444%'),
('E023', N'HoangThiLan555^'),
('E024', N'VoMinhHai666&'),
('E025', N'TranThiMyDung777*'),
('E026', N'DoVanLam888('),
('E027', N'PhamThuHang999)'),
('E028', N'NgoThanhPhong000_');

INSERT INTO Patient (ID, [name], gender, DOB, age, job, [address], nation, workplace, obiectID) VALUES  
('P001', N'Nguyễn Văn Minh', N'Nam', '1985-06-15', 39, N'Kỹ sư', N'123 Đường Lê Lợi, Hà Nội', N'Kinh', N'Công ty Tech Việt', 'O001'),  
('P002', N'Trần Thị Lan', N'Nữ', '1992-09-23', 32, N'Giáo viên', N'456 Đường Nguyễn Trãi, Hồ Chí Minh', N'Tày', N'Trường Tiểu học HCM', NULL),  
('P003', N'Phạm Hữu Nam', N'Nam', '1978-12-05', 46, N'Bác sĩ', N'789 Đường Hai Bà Trưng, Đà Nẵng', N'Nùng', N'Bệnh viện Trung ương ĐN', 'O003'),  
('P004', N'Lê Mai Hoa', N'Nữ', '2000-04-11', 24, N'Sinh viên', N'101 Đường Phan Châu Trinh, Thái Bình', N'Mường', N'Đại học Y Dược Thái Bình', NULL),  
('P005', N'Hoàng Văn Bình', N'Nam', '1965-11-30', 59, N'Đã nghỉ hưu', N'222 Đường Trần Hưng Đạo, Hải Phòng', N'Kinh', NULL, 'O005'),  
('P006', N'Võ Thu Hương', N'Nữ', '1989-08-17', 35, N'Y tá', N'333 Đường Nguyễn Huệ, Cần Thơ', N'Chăm', N'Bệnh viện Đa khoa Cần Thơ', NULL),  
('P007', N'Đặng Văn Sơn', N'Nam', '1995-01-25', 29, N'Cảnh sát', N'444 Đường Lý Tự Trọng, Lâm Đồng', N'H''Mông', N'Công an Tỉnh Lâm Đồng', 'O007'),  
('P008', N'Bùi Thị Ngọc', N'Nữ', '1982-07-08', 42, N'Luật sư', N'555 Đường Lê Thánh Tông, Quảng Ninh', N'Ê Đê', N'Văn phòng Luật sư Quảng Ninh', 'O008'),  
('P009', N'Lâm Quốc Bảo', N'Nam', '1973-10-14', 51, N'Doanh nhân', N'666 Đường Quang Trung, Đồng Nai', N'Kinh', N'Công ty TNHH Quốc Bảo', NULL),  
('P010', N'Phan Khánh Linh', N'Nữ', '2005-03-03', 19, N'Sinh viên', N'777 Đường Phan Đình Phùng, Nghệ An', N'Gia Rai', N'Trường THPT Nghệ An', 'O010');  

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
(1, 'R101', 'D001'),  
(2, 'R102', 'D001'),  
/* Tim mạch */  
(3, 'R103', 'D002'),  
(4, 'R104', 'D002'),  
/* Thần kinh */  
(5, 'R105', 'D003'),  
(6, 'R106', 'D003'),  
/* Ung thư */  
(7, 'R107', 'D004'),  
(8, 'R108', 'D004'),  
/* Nhi khoa */  
(9, 'R109', 'D005'),  
(10, 'R110', 'D005'),  
/* Chỉnh hình */  
(11, 'R111', 'D006'),  
(12, 'R112', 'D006'),  
/* Phụ khoa */  
(13, 'R113', 'D007'),  
(14, 'R114', 'D007'),  
/* Da liễu */  
(15, 'R115', 'D008'),  
(16, 'R116', 'D008'),  
/* Nhãn khoa */  
(17, 'R117', 'D009'),  
(18, 'R118', 'D009'),  
/* Chẩn đoán hình ảnh */  
(19, 'R119', 'D010'),  
(20, 'R120', 'D010');  
/* Tiết niệu */  

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
('CL001', N'Phòng khám Nội tổng hợp'),  
('CL002', N'Phòng khám Ngoại tổng quát'),  
('CL003', N'Phòng khám Nhi khoa'),  
('CL004', N'Phòng khám Sản phụ khoa'),  
('CL005', N'Phòng khám Tim mạch'),  
('CL006', N'Phòng khám Hô hấp'),  
('CL007', N'Phòng khám Nội tiết'),  
('CL008', N'Phòng khám Thận - Tiết niệu'),  
('CL009', N'Phòng khám Tiêu hóa - Gan mật'),  
('CL010', N'Phòng khám Da liễu'),  
('CL011', N'Phòng khám Mắt'),  
('CL012', N'Phòng khám Tai Mũi Họng'),  
('CL013', N'Phòng khám Thần kinh'),  
('CL014', N'Phòng khám Cơ xương khớp'),  
('CL015', N'Phòng khám Tâm lý - Tâm thần'),  
('CL016', N'Phòng khám Huyết học'),  
('CL017', N'Phòng khám Ung bướu'),  
('CL018', N'Phòng khám Chấn thương chỉnh hình'),  
('CL019', N'Phòng khám Y học cổ truyền'),  
('CL020', N'Phòng khám Phục hồi chức năng');  

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
('F010', N'Ngô Thị Hạnh', N'150 Lê Quý Đôn, Bình Dương', '09109876543', 'P010');  

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
('BHXH20240000010', 'P010', '2023-10-21', '2028-10-21');  

INSERT INTO MedicalRecordCreate (ID, createDate, patientID, employeeID) VALUES  
('MR001', '2024-01-10 08:30:00', 'P001', 'E003'),  
('MR002', '2024-01-12 10:15:00', 'P002', 'E006'),  
('MR003', '2024-01-15 14:45:00', 'P003', 'E009'),  
('MR004', '2024-01-18 09:20:00', 'P004', 'E012'),  
('MR005', '2024-01-20 16:10:00', 'P005', 'E015'),  
('MR006', '2024-01-25 11:50:00', 'P006', 'E018'),  
('MR007', '2024-01-27 13:30:00', 'P007', 'E021'),  
('MR008', '2024-02-01 07:45:00', 'P008', 'E024'),  
('MR009', '2024-02-05 17:25:00', 'P009', 'E027'),  
('MR010', '2024-02-08 15:00:00', 'P010', 'E030');  
