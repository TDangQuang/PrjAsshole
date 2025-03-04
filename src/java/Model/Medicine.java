
package Model;

public class Medicine {
    private String ID, name, unit, origin;

    public Medicine() {
    }

    public Medicine(String ID, String name, String unit, String origin) {
        this.ID = ID;
        this.name = name;
        this.unit = unit;
        this.origin = origin;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Medicine{" + "ID=" + ID + ", name=" + name + ", unit=" + unit + ", origin=" + origin + '}';
    }
    
}
