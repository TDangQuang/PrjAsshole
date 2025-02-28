
package Model;

public class Employee {
    private String ID, name, role, departmentName, majorName;

    public Employee() {
    }

    public Employee(String ID, String name, String role, String departmentName, String majorName) {
        this.ID = ID;
        this.name = name;
        this.role = role;
        this.departmentName = departmentName;
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

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", role=" + role + ", departmentName=" + departmentName + ", majorName=" + majorName + '}';
    }
    
}
