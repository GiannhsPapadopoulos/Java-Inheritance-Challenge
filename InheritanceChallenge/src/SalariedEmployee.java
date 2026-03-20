

public class SalariedEmployee extends Employee {

    // Fields
    private double annualSalary;
    private boolean isRetired;

    // Constructor
    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    // Methods
    @Override
    public double collectPay() {
        double paycheck = this.annualSalary / 26;
        double adjustedPay = (this.isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }


    public void retire() {

        terminate("12/12/2025");
        this.isRetired = true;
    }


}