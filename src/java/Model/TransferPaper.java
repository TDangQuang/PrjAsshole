
package Model;

public class TransferPaper {
    private String ID, medicalHistory, diagnosis, signDate, receiveDate, medicalFacilityFromID, medicalFacilityFromName, medicalFacilityID, medicalFacilityToName, patientID, patientName, employeeID, employeeName;

    public TransferPaper() {
    }

    public TransferPaper(String ID, String medicalHistory, String diagnosis, String signDate, String receiveDate, String medicalFacilityFromID, String medicalFacilityFromName, String medicalFacilityID, String medicalFacilityToName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.medicalHistory = medicalHistory;
        this.diagnosis = diagnosis;
        this.signDate = signDate;
        this.receiveDate = receiveDate;
        this.medicalFacilityFromID = medicalFacilityFromID;
        this.medicalFacilityFromName = medicalFacilityFromName;
        this.medicalFacilityID = medicalFacilityID;
        this.medicalFacilityToName = medicalFacilityToName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getSignDate() {
        return signDate;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public String getMedicalFacilityFromName() {
        return medicalFacilityFromName;
    }

    public String getMedicalFacilityToName() {
        return medicalFacilityToName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getMedicalFacilityFromID() {
        return medicalFacilityFromID;
    }

    public String getMedicalFacilityID() {
        return medicalFacilityID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setMedicalFacilityFromName(String medicalFacilityFromName) {
        this.medicalFacilityFromName = medicalFacilityFromName;
    }

    public void setMedicalFacilityToName(String medicalFacilityToName) {
        this.medicalFacilityToName = medicalFacilityToName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setMedicalFacilityFromID(String medicalFacilityFromID) {
        this.medicalFacilityFromID = medicalFacilityFromID;
    }

    public void setMedicalFacilityID(String medicalFacilityID) {
        this.medicalFacilityID = medicalFacilityID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "TransferPaper{" + "ID=" + ID + ", medicalHistory=" + medicalHistory + ", diagnosis=" + diagnosis + ", signDate=" + signDate + ", receiveDate=" + receiveDate + ", medicalFacilityFromID=" + medicalFacilityFromID + ", medicalFacilityFromName=" + medicalFacilityFromName + ", medicalFacilityID=" + medicalFacilityID + ", medicalFacilityToName=" + medicalFacilityToName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
