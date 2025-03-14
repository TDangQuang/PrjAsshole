
package Model;

public class Department {
    private String ID, name, description, location;

    public Department() {
    }

    public Department(String ID, String name, String description, String location) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" + "ID=" + ID + ", name=" + name + ", description=" + description + ", location=" + location + '}';
    }

}
