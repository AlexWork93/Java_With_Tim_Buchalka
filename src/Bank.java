import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfTheCustomer, double initialTransaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            Customer customer = null;
            for (Customer tempCustomer: branch.getCustomers()){
                if (tempCustomer.getName().equals(nameOfTheCustomer)) customer = tempCustomer;
            }            if (customer == null) {
                return branch.newCustomer(nameOfTheCustomer, initialTransaction);
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfTheCustomer, double initialTransaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            Customer customer = null;
            for (Customer tempCustomer: branch.getCustomers()){
                if (tempCustomer.getName().equals(nameOfTheCustomer)) customer = tempCustomer;
            }
            if (customer != null) {
                customer.addTransaction(initialTransaction);
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = null;
        for (Branch br : branches) {
            if (br.getName().equals(branchName)) {
                branch = br;
            } else return false;
        }
        String output = String.format("Customer details for branch %s%n", branchName);
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            Customer customer = branch.getCustomers().get(i);
            output += String.format("Customer: %s[%d]%n", customer.getName(), i + 1);
            if (printTransaction){
                output += "Transactions\n";
                for (int j = 0; j < customer.getTransactions().size(); j++){
                    output += String.format("[%d] Amount %.2f%n", j + 1, customer.getTransactions().get(j));
                }
            }
        }
        System.out.println(output);
        return true;
    }
}
