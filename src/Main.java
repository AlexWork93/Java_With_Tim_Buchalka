
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("New Bank");
        System.out.println(bank);
//          New Bank:
//          No customers yet
        bank.addTransaction("first Customer");
//          Customer [first Customer] was successfully added.
        System.out.println(bank);
//          New Bank:
//	            -	first Customer
        bank.printStatement("first Customer");
//          first Customer: empty balance
        bank.addCustomer("first Customer");
//          Customer [first Customer] is already exist.
        bank.addTransaction("first Customer", 12., 34., 54., 65., 76.);
//          Customer [first Customer] is already exist.
        bank.printStatement("first Customer");
//          first Customer: 241.00
//              -	12.0
//          	-	34.0
//          	-	54.0
//          	-	65.0
//          	-	76.0
        bank.addTransaction("second Customer");
//          Customer [second Customer] was successfully added.
        bank.addTransaction("third Customer");
//          Customer [third Customer] was successfully added.
        bank.addTransaction("fourth Customer");
//          Customer [fourth Customer] was successfully added.
        System.out.println(bank);
//          New Bank:
//          	-	first Customer
//          	-	second Customer
//          	-	third Customer
//          	-	fourth Customer
    }
}