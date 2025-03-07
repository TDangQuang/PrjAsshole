
package Model;

public class PatientFamily {
    private String ID, name, address, phoneNum, patientID, patientName;

    public PatientFamily() {
    }

    public PatientFamily(String ID, String name, String address, String phoneNum, String patientID, String patientName) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.patientID = patientID;
        this.patientName = patientName;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "PatientFamily{" + "ID=" + ID + ", name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + ", patientID=" + patientID + ", patientName=" + patientName + '}';
    }

}
