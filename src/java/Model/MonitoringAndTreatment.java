
package Model;

public class MonitoringAndTreatment {
    private String ID, monitorDate;
    private double weight;
    private int bloodPressure, respiratoryRate;
    private String medicalOrder, performDate, orderPerform, patientID, patientName, employeeID, employeeName;

    public MonitoringAndTreatment() {
    }

    public MonitoringAndTreatment(String ID, String monitorDate, double weight, int bloodPressure, int respiratoryRate, String medicalOrder, String performDate, String orderPerform, String patientID, String patientName, String employeeID, String employeeName) {
        this.ID = ID;
        this.monitorDate = monitorDate;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.respiratoryRate = respiratoryRate;
        this.medicalOrder = medicalOrder;
        this.performDate = performDate;
        this.orderPerform = orderPerform;
        this.patientID = patientID;
        this.patientName = patientName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public String getMonitorDate() {
        return monitorDate;
    }

    public double getWeight() {
        return weight;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public String getMedicalOrder() {
        return medicalOrder;
    }

    public String getPerformDate() {
        return performDate;
    }

    public String getOrderPerform() {
        return orderPerform;
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

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public void setMedicalOrder(String medicalOrder) {
        this.medicalOrder = medicalOrder;
    }

    public void setPerformDate(String performDate) {
        this.performDate = performDate;
    }

    public void setOrderPerform(String orderPerform) {
        this.orderPerform = orderPerform;
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
        return "MonitoringAndTreatment{" + "ID=" + ID + ", monitorDate=" + monitorDate + ", weight=" + weight + ", bloodPressure=" + bloodPressure + ", respiratoryRate=" + respiratoryRate + ", medicalOrder=" + medicalOrder + ", performDate=" + performDate + ", orderPerform=" + orderPerform + ", patientID=" + patientID + ", patientName=" + patientName + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
