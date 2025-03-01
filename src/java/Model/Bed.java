
package Model;

public class Bed {
    private String ID, room, departmentName;

    public Bed() {
    }

    public Bed(String ID, String room, String departmentName) {
        this.ID = ID;
        this.room = room;
        this.departmentName = departmentName;
    }

    public String getID() {
        return ID;
    }

    public String getRoom() {
        return room;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Bed{" + "ID=" + ID + ", room=" + room + ", departmentName=" + departmentName + '}';
    }
    
}
