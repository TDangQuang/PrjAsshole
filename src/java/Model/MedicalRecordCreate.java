
package Model;

public class MedicalRecordCreate {
    private String ID, createDate, patientID, patientName, employeeID, employeeName;

    public MedicalRecordCreate() {
    }

    public MedicalRecordCreate(String ID, String createDate, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.createDate = createDate;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
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

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "MedicalRecordCreate{" + "ID=" + ID + ", createDate=" + createDate + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
