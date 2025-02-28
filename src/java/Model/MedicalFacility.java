
package Model;

public class MedicalFacility {
    private String ID, name, address;

    public MedicalFacility() {
    }

    public MedicalFacility(String ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
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

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MedicalFacility{" + "ID=" + ID + ", name=" + name + ", address=" + address + '}';
    }
    
}
