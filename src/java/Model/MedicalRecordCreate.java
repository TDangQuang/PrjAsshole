
package Model;

public class MedicalRecordCreate {
    private String ID, createDate, patientName, employeeName;

    public MedicalRecordCreate() {
    }

    public MedicalRecordCreate(String ID, String createDate, String patientName, String employeeName) {
        this.ID = ID;
        this.createDate = createDate;
        this.patientName = patientName;
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

    @Override
    public String toString() {
        return "MedicalRecordCreate{" + "ID=" + ID + ", createDate=" + createDate + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
