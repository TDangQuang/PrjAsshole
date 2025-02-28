
package Model;

public class SpecialistExamination {
    private String diseaseName, examinationLevelName, patientName, employeeName, date, request, diagnosis, result;

    public SpecialistExamination() {
    }

    public SpecialistExamination(String diseaseName, String examinationLevelName, String patientName, String employeeName, String date, String request, String diagnosis, String result) {
        this.diseaseName = diseaseName;
        this.examinationLevelName = examinationLevelName;
        this.patientName = patientName;
        this.employeeName = employeeName;
        this.date = date;
        this.request = request;
        this.diagnosis = diagnosis;
        this.result = result;
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
        return "SpecialistExamination{" + "diseaseName=" + diseaseName + ", examinationLevelName=" + examinationLevelName + ", patientName=" + patientName + ", employeeName=" + employeeName + ", date=" + date + ", request=" + request + ", diagnosis=" + diagnosis + ", result=" + result + '}';
    }
    
}
