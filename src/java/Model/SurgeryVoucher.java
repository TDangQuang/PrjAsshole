
package Model;

public class SurgeryVoucher {
    private String ID, result, requestDate, performDate, surgeryID, surgeryName, patientID, patientName, employeeID, employeeName;

    public SurgeryVoucher() {
    }

    public SurgeryVoucher(String ID, String result, String requestDate, String performDate, String surgeryID, String surgeryName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.result = result;
        this.requestDate = requestDate;
        this.performDate = performDate;
        this.surgeryID = surgeryID;
        this.surgeryName = surgeryName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
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

    public String getSurgeryID() {
        return surgeryID;
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

    public void setSurgeryID(String surgeryID) {
        this.surgeryID = surgeryID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "SurgeryVoucher{" + "ID=" + ID + ", result=" + result + ", requestDate=" + requestDate + ", performDate=" + performDate + ", surgeryID=" + surgeryID + ", surgeryName=" + surgeryName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
