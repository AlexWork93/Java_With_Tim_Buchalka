import java.util.ArrayList;

public class Bank {

    private final String name;
    private final ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName){
        return addCustomer(new Customer(customerName));
    }

    public boolean addCustomer(Customer newCustomer){
        if (!this.customers.contains(newCustomer)){
            this.customers.add(newCustomer);
            System.out.printf("Customer [%s] was successfully added.%n", newCustomer.getName());
            return true;
        }
        System.out.printf("Customer [%s] is already exist.%n", newCustomer.getName());
        return false;
    }

    public void addTransaction(String customerName, Double... transactions){
        addCustomer(customerName);
        for (Customer customer: this.customers){
            if (customer.getName().equals(customerName)) customer.addTransaction(transactions);
        }
    }


    public void printStatement(String customerName){
        for (Customer customer: this.customers){
            if (customer.getName().equals(customerName)) {
                System.out.println(customer);
                for (double transaction: customer.getTransactions()){
                    System.out.println("\t-\t" + transaction);
                }
            }
        }
    }

    @Override
    public String toString() {
        String stringCustomers = "";
        for (Customer customer: this.customers){
            stringCustomers += ("\t-\t" + customer.getName() + "\n");
        }
        return String.format("%s: %n%s", this.name, stringCustomers.isEmpty() ? "No customers yet" : stringCustomers);
    }
}
