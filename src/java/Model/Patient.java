
package Model;

public class Patient {
    private String ID, name, gender, DOB;
    private int age;
    private String job, address, nation, workplace, objectName;

    public Patient() {
    }

    public Patient(String ID, String name, String gender, String DOB, int age, String job, String address, String nation, String workplace, String objectName) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.age = age;
        this.job = job;
        this.address = address;
        this.nation = nation;
        this.workplace = workplace;
        this.objectName = objectName;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getAddress() {
        return address;
    }

    public String getNation() {
        return nation;
    }

    public String getWorkplace() {
        return workplace;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + ", name=" + name + ", gender=" + gender + ", DOB=" + DOB + ", age=" + age + ", job=" + job + ", address=" + address + ", nation=" + nation + ", workplace=" + workplace + ", objectName=" + objectName + '}';
    }
    
}
