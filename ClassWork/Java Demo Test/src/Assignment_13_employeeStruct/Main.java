package Assignment_13_employeeStruct;

import Assignment_13_studentStruct.Student;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Arjun", 48900, 10000);
        Student s = new Student(1,"Heloo", 85);
        s.displayStudent();
        e1.display();
    }
}
