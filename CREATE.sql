--CREATE DATABASE PRJAssignmentDB

CREATE TABLE Department(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE Major(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE ObjectForTestScan(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE Employee(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[role] nvarchar(100) NOT NULL,
	departmentID char(10),
	majorID char(10),
	FOREIGN KEY (departmentID) REFERENCES Department(ID),
	FOREIGN KEY (majorID) REFERENCES Major(ID)
)

CREATE TABLE [Login](
	username char(10) PRIMARY KEY,
	password nvarchar(100) NOT NULL,
	FOREIGN KEY (username) REFERENCES Employee(ID)
)

CREATE TABLE Patient(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	gender nvarchar(10) NOT NULL,
	DOB Date NOT NULL,
	age int NOT NULL,
	job nvarchar(100),
	[address] nvarchar(100) NOT NULL,
	nation nvarchar(100),
	workplace nvarchar(100),
	objectID char(10),
	FOREIGN KEY (obiectID) REFERENCES ObjectForTestScan(ID)
)

CREATE TABLE Disease(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE Medicine(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	unit nvarchar(100) NOT NULL,
	origin nvarchar(100) NOT NULL
)

CREATE TABLE [Service](
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	price money NOT NULL
)

CREATE TABLE Bed(
	ID int PRIMARY KEY,
	room char(10) NOT NULL,
	departmentID char(10),
	FOREIGN KEY (departmentID) REFERENCES Department(ID)
)

CREATE TABLE MedicalFacility(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[address] nvarchar(100) NOT NULL
)

CREATE TABLE Clinic(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE ExaminationLevel(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE Surgery(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[level] nvarchar(100) NOT NULL
)

CREATE TABLE MedicalExaminationForm(
	patientID char(10),
	employeeID char(10),
	clinicID char(10),
	[no] int NOT NULL,
	[date] date NOT NULL,
	request nvarchar(100) NOT NULL,
	conclusion nvarchar(100) NOT NULL,
	treatment nvarchar(100) NOT NULL,
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID),
	FOREIGN KEY (clinicID) REFERENCES Clinic(ID)
)

CREATE TABLE MedicalRecord(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE MedicalRecordBook(
	ID char(10) PRIMARY KEY,
	medicalRecordID char(10),
	FOREIGN KEY (medicalRecordID) REFERENCES MedicalRecord(ID)
)

CREATE TABLE Prescription(
	ID char(10) PRIMARY KEY,
	quantity int NOT NULL,
	guide nvarchar(100) NOT NULL,
	[datetime] datetime NOT NULL,
	medicineID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (medicineID) REFERENCES Medicine(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE TestReport(
	ID char(10) PRIMARY KEY,
	[datetimeRequest] datetime NOT NULL,
	[datetimePerform] datetime NOT NULL,
	result nvarchar(100) NOT NULL,
	obiectID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (obiectID) REFERENCES ObjectForTestScan(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE XrayReport(
	ID char(10) PRIMARY KEY,
	quantity int NOT NULL,
	[datetimeRequest] datetime NOT NULL,
	[datetimePerform] datetime NOT NULL,
	result nvarchar(100) NOT NULL,
	obiectID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (obiectID) REFERENCES ObjectForTestScan(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE PatientFamily(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[address] nvarchar(100) NOT NULL,
	phoneNum char(11) NOT NULL,
	patientID char(10),
	FOREIGN KEY (patientID) REFERENCES Patient(ID)
)

CREATE TABLE HealthInsuranceCard(
	cardNum char(15) PRIMARY KEY,
	patientID char(10),
	issueDate date NOT NULL,
	expirationDate date NOT NULL,
	FOREIGN KEY (patientID) REFERENCES Patient(ID)
)

CREATE TABLE ServiceVoucher(
	ID char(10) PRIMARY KEY,
	StartDate datetime NOT NULL,
	EndDate datetime NOT NULL,
	quantity int NOT NULL,
	serviceID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (serviceID) REFERENCES [Service](ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE DispenseMedication(
	ID char(10) PRIMARY KEY,
	requestQuantity int NOT NULL,
	dispenseQuantity int NOT NULL,
	requestDate datetime NOT NULL,
	dispenseDate datetime NOT NULL,
	employeeID char(10),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE MonitoringAndTreatment(
	ID char(10) PRIMARY KEY,
	monitorDate datetime NOT NULL,
	[weight] float NOT NULL,
	bloodPressure int NOT NULL,
	respiratoryRate int NOT NULL,
	medicalOrder nvarchar(1000) NOT NULL,
	performDate datetime NOT NULL,
	orderPerform nvarchar(1000) NOT NULL,
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE SurgeryVoucher(
	ID char(10) PRIMARY KEY,
	result nvarchar(100) NOT NULL,
	requestDate datetime NOT NULL,
	performDate datetime NOT NULL,
	surgeryID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (surgeryID) REFERENCES Surgery(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE DrugUsageReport(
	ID char(10) PRIMARY KEY,
	medicineID char(10),
	patientID char(10),
	employeeID char(10),
	useDate datetime NOT NULL,
	quantity int NOT NULL,
	FOREIGN KEY (medicineID) REFERENCES Medicine(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE BedAssignment(
	patientID char(10) PRIMARY KEY,
	receiveDate datetime NOT NULL,
	returnDate datetime NOT NULL,
	bedID int,
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (bedID) REFERENCES Bed(ID)
)

CREATE TABLE SpecialistExamination(
	diseaseID char(10),
	examinationLevelID char(10),
	patientID char(10),
	employeeID char(10),
	[date] datetime NOT NULL,
	request nvarchar(100) NOT NULL,
	diagnosis nvarchar(100) NOT NULL,
	result nvarchar(100) NOT NULL,
	FOREIGN KEY (diseaseID) REFERENCES Disease(ID),
	FOREIGN KEY (examinationLevelID) REFERENCES ExaminationLevel(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE DischargePaper(
	ID char(10) PRIMARY KEY,
	getInDate datetime NOT NULL,
	getOutDate datetime NOT NULL,
	treatmentMethod nvarchar(100) NOT NULL,
	result nvarchar(100) NOT NULL,
	doctorAdvice nvarchar(100) NOT NULL,
	diseaseID char(10),
	departmentID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (diseaseID) REFERENCES Disease(ID),
	FOREIGN KEY (departmentID) REFERENCES Department(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE TransferPaper(
	ID char(10) PRIMARY KEY,
	medicalHistory nvarchar(200) NOT NULL,
	diagnosis nvarchar(100) NOT NULL,
	signDate datetime NOT NULL,
	receiveDate datetime NOT NULL,
	medicalFacilityFromID char(10),
	medicalFacilityToID char(10),
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (medicalFacilityFromID) REFERENCES MedicalFacility(ID),
	FOREIGN KEY (medicalFacilityToID) REFERENCES MedicalFacility(ID),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)

CREATE TABLE MedicalRecordCreate(
	ID char(10) PRIMARY KEY,
	createDate datetime NOT NULL,
	patientID char(10),
	employeeID char(10),
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)
