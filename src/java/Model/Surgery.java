
package Model;

public class Surgery {
    private String ID, name, level;

    public Surgery() {
    }

    public Surgery(String ID, String name, String level) {
        this.ID = ID;
        this.name = name;
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Surgery{" + "ID=" + ID + ", name=" + name + ", level=" + level + '}';
    }
    
}
