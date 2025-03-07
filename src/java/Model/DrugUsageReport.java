
package Model;

public class DrugUsageReport {
    private String ID, medicineID, medicineName, patientID, patientName, employeeID, employeeName, useDate;
    private int quantity;

    public DrugUsageReport() {
    }

    public DrugUsageReport(String ID, String medicineID, String medicineName, String patientID, String patientName, String employeeID, String employeeName, String useDate, int quantity) {
        this.ID = ID;
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
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

    public String getMedicineID() {
        return medicineID;
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

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "DrugUsageReport{" + "ID=" + ID + ", medicineID=" + medicineID + ", medicineName=" + medicineName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + ", useDate=" + useDate + ", quantity=" + quantity + '}';
    }

}
