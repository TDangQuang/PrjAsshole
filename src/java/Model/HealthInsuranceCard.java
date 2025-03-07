
package Model;

public class HealthInsuranceCard {
    private String cardNum, patientID, patientName, issueDate, expirationDate;

    public HealthInsuranceCard() {
    }

    public HealthInsuranceCard(String cardNum, String patientID, String patientName, String issueDate, String expirationDate) {
        this.cardNum = cardNum;
        this.patientID = patientID;
        this.patientName = patientName;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "HealthInsuranceCard{" + "cardNum=" + cardNum + ", patientID=" + patientID + ", patientName=" + patientName + ", issueDate=" + issueDate + ", expirationDate=" + expirationDate + '}';
    }

}
