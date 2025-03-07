
package Model;

public class DischargePaper {
    private String ID, getInDate, getOutDate, treatmentMethod, result, doctorAdvice, diseaseID, diseaseName, departmentID, departmentName, patientID, patientName, employeeID, employeeName;

    public DischargePaper() {
    }

    public DischargePaper(String ID, String getInDate, String getOutDate, String treatmentMethod, String result, String doctorAdvice, String diseaseID, String diseaseName, String departmentID, String departmentName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.getInDate = getInDate;
        this.getOutDate = getOutDate;
        this.treatmentMethod = treatmentMethod;
        this.result = result;
        this.doctorAdvice = doctorAdvice;
        this.diseaseID = diseaseID;
        this.diseaseName = diseaseName;
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getGetInDate() {
        return getInDate;
    }

    public String getGetOutDate() {
        return getOutDate;
    }

    public String getTreatmentMethod() {
        return treatmentMethod;
    }

    public String getResult() {
        return result;
    }

    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDiseaseID() {
        return diseaseID;
    }

    public String getDepartmentID() {
        return departmentID;
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

    public void setGetInDate(String getInDate) {
        this.getInDate = getInDate;
    }

    public void setGetOutDate(String getOutDate) {
        this.getOutDate = getOutDate;
    }

    public void setTreatmentMethod(String treatmentMethod) {
        this.treatmentMethod = treatmentMethod;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "DischargePaper{" + "ID=" + ID + ", getInDate=" + getInDate + ", getOutDate=" + getOutDate + ", treatmentMethod=" + treatmentMethod + ", result=" + result + ", doctorAdvice=" + doctorAdvice + ", diseaseID=" + diseaseID + ", diseaseName=" + diseaseName + ", departmentID=" + departmentID + ", departmentName=" + departmentName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
