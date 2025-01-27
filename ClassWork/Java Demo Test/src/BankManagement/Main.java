package BankManagement;

public class Main {
    public static void main(String[] args) {
        BankAccount empAccount = new BankAccount("EMP12345", 5000.0);
        Employee employee = new Employee("John Doe", empAccount, 101, "TCS");

        BankAccount stuAccount = new BankAccount("STU12345", 1000.0);
        Student student = new Student("Jane Smith", stuAccount, 1001, "FirstBit");

        System.out.println(employee.getName());
        System.out.println(employee.getBankAccount().getAccountNumber());
        student.isEligible();

//        BankAccount tempAccount = new BankAccount("Temp123", 1000.0);
//        Customer c = new Customer("temp", tempAccount);
    }
}
