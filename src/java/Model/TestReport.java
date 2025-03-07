
package Model;

public class TestReport {
    private String ID, datetimeRequest, datetimePerform, result, objectID, objectName, patientID, patientName, employeeID, employeeName;

    public TestReport() {
    }

    public TestReport(String ID, String datetimeRequest, String datetimePerform, String result, String objectID, String objectName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.datetimeRequest = datetimeRequest;
        this.datetimePerform = datetimePerform;
        this.result = result;
        this.objectID = objectID;
        this.objectName = objectName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getDatetimeRequest() {
        return datetimeRequest;
    }

    public String getDatetimePerform() {
        return datetimePerform;
    }

    public String getResult() {
        return result;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getObjectID() {
        return objectID;
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

    public void setDatetimeRequest(String datetimeRequest) {
        this.datetimeRequest = datetimeRequest;
    }

    public void setDatetimePerform(String datetimePerform) {
        this.datetimePerform = datetimePerform;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "TestReport{" + "ID=" + ID + ", datetimeRequest=" + datetimeRequest + ", datetimePerform=" + datetimePerform + ", result=" + result + ", objectID=" + objectID + ", objectName=" + objectName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
