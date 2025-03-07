
package Model;

public class MedicalRecordBook {
    private String ID, medicalRecordID, medicalRecordName;

    public MedicalRecordBook() {
    }

    public MedicalRecordBook(String ID, String medicalRecordID, String medicalRecordName) {
        this.ID = ID;
        this.medicalRecordID = medicalRecordID;
        this.medicalRecordName = medicalRecordName;
    }

    public String getID() {
        return ID;
    }

    public String getMedicalRecordID() {
        return medicalRecordID;
    }

    public String getMedicalRecordName() {
        return medicalRecordName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMedicalRecordID(String medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public void setMedicalRecordName(String medicalRecordName) {
        this.medicalRecordName = medicalRecordName;
    }

    @Override
    public String toString() {
        return "MedicalRecordBook{" + "ID=" + ID + ", medicalRecordID=" + medicalRecordID + ", medicalRecordName=" + medicalRecordName + '}';
    }

}
