public class BankAccount extends AbstractBankAccount implements AccountOperations {


    public BankAccount(int accountNumber, double accountBalance, String accountName, String phoneName) {
        super(accountNumber, accountBalance, accountName, phoneName);
    }

    public BankAccount(int accountNumber, String accountName, String phoneName) {
        super(accountNumber, accountName, phoneName);
    }

    public BankAccount() {
        super();
    }


    @Override
    public boolean withdrawFunds(double amountToWithdraw) {
        System.out.println("===============================\nWithdraw: $" + amountToWithdraw);
        if (this.getAccountBalance() < amountToWithdraw ){
            System.out.println("Insufficient balance");
            printCurrentBalance();
            return false;
        }else if(amountToWithdraw < 0){
            System.out.println("incorrect amount");
            return false;
        }
        this.setAccountBalance(this.getAccountBalance() - amountToWithdraw);
        printCurrentBalance();
        return true;
    }

    @Override
    public boolean depositFunds(double amountToDeposit) {
        System.out.println("===============================\nDeposit: $" + amountToDeposit);
        if (amountToDeposit < 0){
            System.out.println("incorrect amount");
            return false;
        }
        this.setAccountBalance(this.getAccountBalance() + amountToDeposit);
        printCurrentBalance();
        return true;    }

    @Override
    public void printCurrentBalance() {
        System.out.println("Your current balance is: $" + this.getAccountBalance());
    }

    @Override
    public void printAccount() {
        System.out.println(this);
    }
}
