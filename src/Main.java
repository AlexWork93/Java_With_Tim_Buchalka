
public class Main {
    public static void main(String[] args) {
        BankAccount defaultBankAccount = new BankAccount();
        defaultBankAccount.printAccount();
        BankAccount bankAccount = new BankAccount(123456,"Georgy", "987654321");
        bankAccount.printAccount();
        bankAccount.withdrawFunds(-10);
        bankAccount.withdrawFunds(100);
        bankAccount.depositFunds(-10);
        bankAccount.depositFunds(100);
        bankAccount.withdrawFunds(50);
        bankAccount.printAccount();

    }
}