
package Model;

public class BedAssignment {
    private String patientName, receiveDate, returnDate, bedID;

    public BedAssignment() {
    }

    public BedAssignment(String patientName, String receiveDate, String returnDate, String bedID) {
        this.patientName = patientName;
        this.receiveDate = receiveDate;
        this.returnDate = returnDate;
        this.bedID = bedID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getBedID() {
        return bedID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setBedID(String bedID) {
        this.bedID = bedID;
    }

    @Override
    public String toString() {
        return "BedAssignment{" + "patientName=" + patientName + ", receiveDate=" + receiveDate + ", returnDate=" + returnDate + ", bedID=" + bedID + '}';
    }
    
}
