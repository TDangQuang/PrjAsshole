
package Model;

public class SurgeryVoucher {
    private String ID, result, requestDate, performDate, surgeryName, patientName, employeeName;

    public SurgeryVoucher() {
    }

    public SurgeryVoucher(String ID, String result, String requestDate, String performDate, String surgeryName, String patientName, String employeeName) {
        this.ID = ID;
        this.result = result;
        this.requestDate = requestDate;
        this.performDate = performDate;
        this.surgeryName = surgeryName;
        this.patientName = patientName;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getResult() {
        return result;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public String getPerformDate() {
        return performDate;
    }

    public String getSurgeryName() {
        return surgeryName;
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

    public void setResult(String result) {
        this.result = result;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public void setPerformDate(String performDate) {
        this.performDate = performDate;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "SurgeryVoucher{" + "ID=" + ID + ", result=" + result + ", requestDate=" + requestDate + ", performDate=" + performDate + ", surgeryName=" + surgeryName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
