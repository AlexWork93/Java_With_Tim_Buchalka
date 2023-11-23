public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name,
                            String birthDate,
                            String endDate,
                            long employeeId,
                            String hireDate,
                            double annualSalary,
                            boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void retire() {
        System.out.println("******************************************");
        if (isRetired) {
            System.out.println(this + "\n\nIs already retired");
        } else {
            System.out.println(this + "\n\nIs retired now");
            isRetired = true;
        }
        System.out.println("******************************************\n");
    }
}
