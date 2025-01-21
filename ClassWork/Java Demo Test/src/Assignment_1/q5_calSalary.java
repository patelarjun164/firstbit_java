package Assignment_1;

public class q5_calSalary {
    public static void main(String[] args) {
        float basic = 5200;
        float salary;
        if(basic <=5000){
            salary = basic + (basic * 10)/100 + (basic * 20)/100 + (basic*30)/100;
        }
        else
            salary = basic + (basic * 15)/100 + (basic * 25)/100 + (basic*30)/100;

        System.out.println("Salary is " + salary);
    }
}
