public abstract class AbstractBankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountName;
    private String phoneName;

    public AbstractBankAccount(int accountNumber, double accountBalance, String accountName, String phoneName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.phoneName = phoneName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    @Override
    public String toString(){
        return "Number: " + accountNumber + "\n" +
                "Name: " + accountName + "\n" +
                "Balance: " + accountBalance + "\n" +
                "Phone: " + phoneName;
    }
}
