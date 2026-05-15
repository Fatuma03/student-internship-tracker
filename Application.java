public class Application {

    private String companyName;
    private String positionTitle;
    private String dateApplied;
    private String status;

    public Application(String companyName, String positionTitle, String dateApplied, String status) {
        this.companyName = companyName;
        this.positionTitle = positionTitle;
        this.dateApplied = dateApplied;
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return companyName + " | " + positionTitle + " | " + dateApplied + " | " + status;
    }

}