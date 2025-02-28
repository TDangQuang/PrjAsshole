
package Model;

public class MedicalRecordBook {
    private String ID, medicalRecordName;

    public MedicalRecordBook() {
    }

    public MedicalRecordBook(String ID, String medicalRecordName) {
        this.ID = ID;
        this.medicalRecordName = medicalRecordName;
    }

    public String getID() {
        return ID;
    }

    public String getMedicalRecordName() {
        return medicalRecordName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMedicalRecordName(String medicalRecordName) {
        this.medicalRecordName = medicalRecordName;
    }

    @Override
    public String toString() {
        return "MedicalRecordBook{" + "ID=" + ID + ", medicalRecordName=" + medicalRecordName + '}';
    }
    
}
