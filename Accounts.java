package ExpenseProject;

public class Accounts {
    private String paidbyId;
    private double amount;
    private String dateandtime;
    private String description;
    public Accounts(String paidbyId, double amount, String dateandtime, String description) {
        this.paidbyId = paidbyId;
        this.amount = amount;
        this.dateandtime = dateandtime;
        this.description = description;
    }
    public String getPaidbyId() {
        return paidbyId;
    }
    public void setPaidbyId(String paidbyId) {
        this.paidbyId = paidbyId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDateandtime() {
        return dateandtime;
    }
    public void setDateandtime(String dateandtime) {
        this.dateandtime = dateandtime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        
        return paidbyId+"|"+amount+"|"+dateandtime+"|"+description;
    }

}
