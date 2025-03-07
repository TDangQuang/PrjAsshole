
package Model;

public class MedicalExaminationForm {
    private String patientID, patientName, employeeID, employeeName, clinicID, clinicName;
    private int no;
    private String date, request, conclusion, treatment;

    public MedicalExaminationForm() {
    }

    public MedicalExaminationForm(String patientID, String patientName, String employeeID, String employeeName, String clinicID, String clinicName, int no, String date, String request, String conclusion, String treatment) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.clinicID = clinicID;
        this.clinicName = clinicName;
        this.no = no;
        this.date = date;
        this.request = request;
        this.conclusion = conclusion;
        this.treatment = treatment;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getClinicID() {
        return clinicID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getClinicName() {
        return clinicName;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setClinicID(String clinicID) {
        this.clinicID = clinicID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "MedicalExaminationForm{" + "patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + ", clinicID=" + clinicID + ", clinicName=" + clinicName + ", no=" + no + ", date=" + date + ", request=" + request + ", conclusion=" + conclusion + ", treatment=" + treatment + '}';
    }

}
