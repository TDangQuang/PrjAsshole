
package Model;

public class SpecialistExamination {
    private String diseaseID, diseaseName, examinationLevelID, examinationLevelName, patientID, patientName, employeeID, employeeName, date, request, diagnosis, result;

    public SpecialistExamination() {
    }

    public SpecialistExamination(String diseaseID, String diseaseName, String examinationLevelID, String examinationLevelName, String patientID, String patientName, String employeeID, String employeeName, String date, String request, String diagnosis, String result) {
        this.diseaseID = diseaseID;
        this.diseaseName = diseaseName;
        this.examinationLevelID = examinationLevelID;
        this.examinationLevelName = examinationLevelName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.date = date;
        this.request = request;
        this.diagnosis = diagnosis;
        this.result = result;
    }

    public String getDiseaseID() {
        return diseaseID;
    }

    public String getExaminationLevelID() {
        return examinationLevelID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getExaminationLevelName() {
        return examinationLevelName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDate() {
        return date;
    }

    public String getRequest() {
        return request;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getResult() {
        return result;
    }

    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public void setExaminationLevelID(String examinationLevelID) {
        this.examinationLevelID = examinationLevelID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setExaminationLevelName(String examinationLevelName) {
        this.examinationLevelName = examinationLevelName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SpecialistExamination{" + "diseaseID=" + diseaseID + ", diseaseName=" + diseaseName + ", examinationLevelID=" + examinationLevelID + ", examinationLevelName=" + examinationLevelName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + ", date=" + date + ", request=" + request + ", diagnosis=" + diagnosis + ", result=" + result + '}';
    }

}
