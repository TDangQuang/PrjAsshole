
package Model;

public class Prescription {
    private String ID;
    private int quantity;
    private String guide, datetime, medicineID, medicineName, patientID, patientName, employeeID, employeeName;

    public Prescription() {
    }

    public Prescription(String ID, int quantity, String guide, String datetime, String medicineID, String medicineName, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.quantity = quantity;
        this.guide = guide;
        this.datetime = datetime;
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getGuide() {
        return guide;
    }

    public String getDatetime() {
        return datetime;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
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
        return "Prescription{" + "ID=" + ID + ", quantity=" + quantity + ", guide=" + guide + ", datetime=" + datetime + ", medicineID=" + medicineID + ", medicineName=" + medicineName + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
