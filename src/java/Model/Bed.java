
package Model;

public class Bed {
    private String ID, room, departmentID, departmentName;

    public Bed() {
    }

    public Bed(String ID, String room, String departmentID, String departmentName) {
        this.ID = ID;
        this.room = room;
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    public String getID() {
        return ID;
    }

    public String getRoom() {
        return room;
    }

    public String getDepartmentID() {
        return departmentID;
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

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Bed{" + "ID=" + ID + ", room=" + room + ", departmentID=" + departmentID + ", departmentName=" + departmentName + '}';
    }

}
