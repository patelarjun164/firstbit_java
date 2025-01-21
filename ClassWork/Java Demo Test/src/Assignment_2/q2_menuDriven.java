package Assignment_2;
import java.util.Scanner;

public class q2_menuDriven {
    public static void main(String[] args) {
        System.out.println("----Choices-----\n");
        System.out.println("Enter 1 for calculate Even odd\n");
        System.out.println("Enter 2 for calculate Salary\n");
        Scanner sc = new Scanner(System.in);
        int choiceNum = sc.nextInt();

        if (choiceNum == 1)
        {
            int num;
            System.out.println("Enter number to check weather number is even or odd.\n");
            num = sc.nextInt();
            System.out.println(num%2==1 ? "Num is Odd Num" : "Num is Even Number");
        }
        else
        {
            double basic;
            System.out.println("Enter Basic salary\n");
            basic = sc.nextDouble();
            double salary;
            if (basic <= 5000)
            {
                salary = basic + (basic * 10) / 100 + (basic * 20) / 100 + (basic * 30) / 100;
            }
            else
                salary = basic + (basic * 15) / 100 + (basic * 25) / 100 + (basic * 30) / 100;

            System.out.println("Salary is " + salary);
        }
    }
}
