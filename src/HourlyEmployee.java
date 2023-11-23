public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name,
                          String birthDate,
                          String endDate,
                          long employeeId,
                          String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void getDoublePay() {
        System.out.println("******************************************");
        System.out.println(this + "\n\nIs double payed now");
        hourlyPayRate *= 2;
        System.out.println("Current hourlyPayRate= " + hourlyPayRate);
        System.out.println("******************************************\n");
    }
}
