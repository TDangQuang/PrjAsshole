
package Model;

public class ServiceVoucher {
    private String ID, startDate, endDate;
    private int quantity;
    private String serviceID, serviceName, patientID, patientName, employeeID, employeeName;

    public ServiceVoucher() {
    }

    public ServiceVoucher(String ID, String startDate, String endDate, int quantity, String serviceID, String serviceName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantity = quantity;
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getServiceID() {
        return serviceID;
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

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "ServiceVoucher{" + "ID=" + ID + ", startDate=" + startDate + ", endDate=" + endDate + ", quantity=" + quantity + ", serviceID=" + serviceID + ", serviceName=" + serviceName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
