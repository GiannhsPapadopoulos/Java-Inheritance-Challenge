

public class HourlyEmployee extends Employee {

    // Fields
    private double hourlyPayRate;


    // Constructor
    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }


    @Override
    public double collectPay() {
        return 40 * this.hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}