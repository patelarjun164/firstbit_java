package TrailAbstarctChatGpt;

public class Main {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = new Employee[3];

        // Initialize with different types of employees
        employees[0] = new HR("John Doe", 1, 50000, 5000);
        employees[1] = new Admin("Jane Smith", 2, 25, 40);  // This will compile

        // This will cause a runtime error when we try to access calculateSalary()
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getName() + "'s salary: $" + emp.calculateSalary());
            }
        }
    }
}