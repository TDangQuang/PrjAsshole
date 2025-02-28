
package Model;

public class DischargePaper {
    private String ID, getInDate, getOutDate, treatmentMethod, result, doctorAdvice, diseaseName, departmentName, patientName, employeeName;

    public DischargePaper() {
    }

    public DischargePaper(String ID, String getInDate, String getOutDate, String treatmentMethod, String result, String doctorAdvice, String diseaseName, String departmentName, String patientName, String employeeName) {
        this.ID = ID;
        this.getInDate = getInDate;
        this.getOutDate = getOutDate;
        this.treatmentMethod = treatmentMethod;
        this.result = result;
        this.doctorAdvice = doctorAdvice;
        this.diseaseName = diseaseName;
        this.departmentName = departmentName;
        this.patientName = patientName;
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

    @Override
    public String toString() {
        return "DischargePaper{" + "ID=" + ID + ", getInDate=" + getInDate + ", getOutDate=" + getOutDate + ", treatmentMethod=" + treatmentMethod + ", result=" + result + ", doctorAdvice=" + doctorAdvice + ", diseaseName=" + diseaseName + ", departmentName=" + departmentName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
