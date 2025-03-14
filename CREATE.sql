--CREATE DATABASE PRJAssignmentDB

CREATE TABLE Patient(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	gender nvarchar(10) NOT NULL,
	DOB Date NOT NULL,
	age int NOT NULL,
	job nvarchar(100) NOT NULL,
	[address] nvarchar(100) NOT NULL,
	nation nvarchar(100) NOT NULL,
	workplace nvarchar(100) NOT NULL,
)

CREATE TABLE Department(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[description] nvarchar(1000) NOT NULL,
	[location] nvarchar(100) NOT NULL
)

CREATE TABLE Major(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL
)

CREATE TABLE Employee(
	ID char(10) PRIMARY KEY,
	[name] nvarchar(100) NOT NULL,
	[role] nvarchar(100) NOT NULL,
	departmentID char(10) NOT NULL,
	majorID char(10) NOT NULL,
	FOREIGN KEY (departmentID) REFERENCES Department(ID),
	FOREIGN KEY (majorID) REFERENCES Major(ID)
)

CREATE TABLE [Login](
	employeeID char(10) NOT NULL,
	username nvarchar(100) NOT NULL,
	[password] nvarchar(100),
	loginRole nvarchar(100),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID),
	PRIMARY KEY (employeeID, username)
)

CREATE TABLE MonitoringAndTreatment(
	ID char(10) PRIMARY KEY,
	monitorDate date NOT NULL,
	[weight] float NOT NULL,
	bloodPressure int NOT NULL,
	respiratoryRate int NOT NULL,
	medicalOrder nvarchar(1000) NOT NULL,
	performDate date NOT NULL,
	orderPerform nvarchar(1000) NOT NULL,
	patientID char(10) NOT NULL,
	employeeID char(10) NOT NULL,
	FOREIGN KEY (patientID) REFERENCES Patient(ID),
	FOREIGN KEY (employeeID) REFERENCES Employee(ID)
)
