
package Model;

public class ObjectForTestScan {
    private String ID;
    private String name;

    public ObjectForTestScan() {
    }

    public ObjectForTestScan(String ID, String name) {
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
        return "ObjectForTestScan{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
