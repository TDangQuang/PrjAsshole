
package Model;

public class Employee {
    private String ID, name, role, departmentID, majorID, departmentName, majorName;

    public Employee() {
    }

    public Employee(String ID, String name, String role, String departmentID, String majorID, String departmentName, String majorName) {
        this.ID = ID;
        this.name = name;
        this.role = role;
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.majorID = majorID;
        this.majorName = majorName;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getMajorName() {
        return majorName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", role=" + role + ", departmentID=" + departmentID + ", departmentName=" + departmentName + ", majorID=" + majorID + ", majorName=" + majorName + '}';
    }

}
