package BankManagement;

public class Employee extends Customer{
    int employeeId;
    String CompanyName;

    public Employee(String name, BankAccount bankAccount, int employeeId, String companyName) {
        super(name, bankAccount);
        this.employeeId = employeeId;
        CompanyName = companyName;
    }

    @Override
    public void isEligible() {
        System.out.println("Method override in Employee Class");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}
