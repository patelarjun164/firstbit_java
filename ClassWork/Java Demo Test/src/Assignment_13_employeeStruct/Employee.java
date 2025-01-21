package Assignment_13_employeeStruct;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private int comission;

    public Employee(int id, String name, int salary, int comission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.comission = comission;
    }

    public void display(){
        System.out.println("Id --> " + id);
        System.out.println("Name --> " + name);
        System.out.println("Salary --> " + salary);
        System.out.println("comission --> " + comission);
    }

}
