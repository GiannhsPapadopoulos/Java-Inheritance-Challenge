

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "1/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee john = new HourlyEmployee("John", "05/05/1970", "03/03/2021", 15);
        System.out.println(john);
        System.out.println("John's Paycheck = $" + john.collectPay());
        System.out.println("John's Holiday Pay = $" + john.getDoublePay());


    }
}