
package Model;

public class DrugUsageReport {
    private String ID, medicineName, patientName, employeeName, useDate;
    private int quantity;

    public DrugUsageReport() {
    }

    public DrugUsageReport(String ID, String medicineName, String patientName, String employeeName, String useDate, int quantity) {
        this.ID = ID;
        this.medicineName = medicineName;
        this.patientName = patientName;
        this.employeeName = employeeName;
        this.useDate = useDate;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getUseDate() {
        return useDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DrugUsageReport{" + "ID=" + ID + ", medicineName=" + medicineName + ", patientName=" + patientName + ", employeeName=" + employeeName + ", useDate=" + useDate + ", quantity=" + quantity + '}';
    }
    
}
