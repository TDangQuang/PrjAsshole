
package Model;

public class MedicalRecord {
    private String ID, name;

    public MedicalRecord() {
    }

    public MedicalRecord(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
