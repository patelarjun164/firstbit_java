package Employee;

public class Admin extends Employee{
    private int allowance;
    public Admin(){
        System.out.println("Object created");
    }
    @Override
    public void calSalary() {
        System.out.println(" Admin:  salary");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "allowance=" + allowance +
                '}';
    }
}
