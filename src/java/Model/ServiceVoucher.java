
package Model;

public class ServiceVoucher {
    private String ID, startDate, endDate;
    private int quantity;
    private String serviceName, patientName, employeeName;

    public ServiceVoucher() {
    }

    public ServiceVoucher(String ID, String startDate, String endDate, int quantity, String serviceName, String patientName, String employeeName) {
        this.ID = ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantity = quantity;
        this.serviceName = serviceName;
        this.patientName = patientName;
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

    @Override
    public String toString() {
        return "ServiceVoucher{" + "ID=" + ID + ", startDate=" + startDate + ", endDate=" + endDate + ", quantity=" + quantity + ", serviceName=" + serviceName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
