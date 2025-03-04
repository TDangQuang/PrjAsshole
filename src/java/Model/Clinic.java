
package Model;

public class Clinic {
    private String ID, name;

    public Clinic() {
    }

    public Clinic(String ID, String name) {
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
        return "Clinic{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
