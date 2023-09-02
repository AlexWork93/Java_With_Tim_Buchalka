public interface AccountOperations {

    boolean withdrawFunds(double amountToWithdraw);
    boolean depositFunds(double amountToDeposit);
    void printCurrentBalance();
    void  printAccount();
}
