
package Model;

public class TransferPaper {
    private String ID, medicalHistory, diagnosis, signDate, receiveDate, medicalFacilityFromName, medicalFacilityToName, patientName, employeeName;

    public TransferPaper() {
    }

    public TransferPaper(String ID, String medicalHistory, String diagnosis, String signDate, String receiveDate, String medicalFacilityFromName, String medicalFacilityToName, String patientName, String employeeName) {
        this.ID = ID;
        this.medicalHistory = medicalHistory;
        this.diagnosis = diagnosis;
        this.signDate = signDate;
        this.receiveDate = receiveDate;
        this.medicalFacilityFromName = medicalFacilityFromName;
        this.medicalFacilityToName = medicalFacilityToName;
        this.patientName = patientName;
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

    @Override
    public String toString() {
        return "TransferPaper{" + "ID=" + ID + ", medicalHistory=" + medicalHistory + ", diagnosis=" + diagnosis + ", signDate=" + signDate + ", receiveDate=" + receiveDate + ", medicalFacilityFromName=" + medicalFacilityFromName + ", medicalFacilityToName=" + medicalFacilityToName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
