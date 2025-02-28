
package Model;

public class MedicalExaminationForm {
    private String patientName, employeeName, clinicName;
    private int no;
    private String date, request, conclusion, treatment;

    public MedicalExaminationForm() {
    }

    public MedicalExaminationForm(String patientName, String employeeName, String clinicName, int no, String date, String request, String conclusion, String treatment) {
        this.patientName = patientName;
        this.employeeName = employeeName;
        this.clinicName = clinicName;
        this.no = no;
        this.date = date;
        this.request = request;
        this.conclusion = conclusion;
        this.treatment = treatment;
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
        return "MedicalExaminationForm{" + "patientName=" + patientName + ", employeeName=" + employeeName + ", clinicName=" + clinicName + ", no=" + no + ", date=" + date + ", request=" + request + ", conclusion=" + conclusion + ", treatment=" + treatment + '}';
    }
    
}
