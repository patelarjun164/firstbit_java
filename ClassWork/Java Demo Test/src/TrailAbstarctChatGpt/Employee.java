package TrailAbstarctChatGpt;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method that must be implemented by subclasses
    abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class HR extends Employee {
    private double baseSalary;
    private double bonus;

    public HR(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Admin extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Admin(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate + hoursWorked;
    }

    // Notice we "forgot" to override calculateSalary()
    // This will compile but cause runtime errors
}