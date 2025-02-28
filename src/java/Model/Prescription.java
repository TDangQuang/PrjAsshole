
package Model;

public class Prescription {
    private String ID;
    private int quantity;
    private String guide, datetime, medicineName, patientName, employeeName;

    public Prescription() {
    }

    public Prescription(String ID, int quantity, String guide, String datetime, String medicineName, String patientName, String employeeName) {
        this.ID = ID;
        this.quantity = quantity;
        this.guide = guide;
        this.datetime = datetime;
        this.medicineName = medicineName;
        this.patientName = patientName;
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

    @Override
    public String toString() {
        return "Prescription{" + "ID=" + ID + ", quantity=" + quantity + ", guide=" + guide + ", datetime=" + datetime + ", medicineName=" + medicineName + ", patientName=" + patientName + ", employeeName=" + employeeName + '}';
    }
    
}
