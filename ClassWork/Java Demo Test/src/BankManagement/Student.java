package BankManagement;

public class Student extends Customer{
    int studentId;
    String clgName;

    public Student(String name, BankAccount bankAccount,int studentId, String clgName) {
        super(name, bankAccount);
        this.studentId = studentId;
        this.clgName = clgName;
    }

    @Override
    public void isEligible() {
        System.out.println("Method override in Student Class");
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
