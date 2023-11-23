
public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Steeve", "10.10.100", "11.11.111", 123456789, "10.10.111", 500.50, false);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ben", "12.12.112", "13.13.113", 987654321, "12.12.113", 20.20);

        salariedEmployee.retire();
        salariedEmployee.retire();

        hourlyEmployee.getDoublePay();
        hourlyEmployee.getDoublePay();
    }
}