package Employee;

public abstract class HR extends Employee{
    private int commision;

    public HR(){
        System.out.println("Default constructor called! Object Created");
    }

//    public void calSalary(){
//        System.out.println(" HR:  Commsion plus salary");
//    }

    public void greet(){
        System.out.println("Hello in greet method!");
    }

    @Override
    public String toString() {
        return "HR{" +
                "commision=" + commision +
                '}';
    }
}
