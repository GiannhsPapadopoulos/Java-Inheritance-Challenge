

public class Worker {

    // Fields
    private String name;
    private String birthDate;
    protected String endDate;

    // Default Constructor
    public Worker() {

    }

    // Constructor
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
//        this.endDate = endDate; We don't know the endDate of the worker.
    }

    // Methods
    public int getAge() {

        int currentYear = 2026;
        int birthYear = Integer.parseInt((this.birthDate).substring(6)); // 01/12/2001
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        return "Worker{" +
                "name=" + this.name + '\'' +
                ", birthDate='" + this.birthDate + '\'' +
                ", endDate='" + this.endDate + '\'' +
                '}';
    }
}