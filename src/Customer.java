import java.util.ArrayList;

public class Customer {
    private final String name;
    private double balance;
    private final ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double... amount) {
        for (double item : amount) {
            this.transactions.add(item);
            balance += item;
        }
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        if (this.balance == 0) {
            return String.format("%s: %s", this.name, "empty balance");
        } else {
            return String.format("%s: %.2f", this.name, this.balance);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equalsIgnoreCase(((Customer) obj).name) && this.getClass().equals(obj.getClass());
    }
}
