
package Model;

public class XrayReport {
    private String ID;
    private int quantity;
    private String datetimeRequest, datetimePerform, result, objectName, patientName, employeeName;

    public XrayReport() {
    }

    public XrayReport(String ID, int quantity, String datetimeRequest, String datetimePerform, String result, String objectName, String patientName, String employeeName) {
        this.ID = ID;
        this.quantity = quantity;
        this.datetimeRequest = datetimeRequest;
        this.datetimePerform = datetimePerform;
        this.result = result;
        this.objectName = objectName;
        this.patientName = patientName;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public int getQuantity() {
        return quantity;
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

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "XrayReport{" + "ID=" + ID + ", quantity=" + quantity + ", datetimeRequest=" + datetimeRequest + ", datetimePerform=" + datetimePerform + ", result=" + result + ", objectName=" + objectName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
