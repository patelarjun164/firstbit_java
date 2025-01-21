package Assignment_2;
import java.util.Scanner;

public class a4_basicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char operator;
        System.out.println("Enter the value of number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter the value of number 2: ");
        num2 = sc.nextInt();

        System.out.println("------Enter your choice :------\n");
        System.out.println("For Addition enter '+'\n");
        System.out.println("For Subtraction enter '-'\n");
        System.out.println("For Multiplication enter '*'\n");
        System.out.println("For Divivsion enter '/'\n");
        System.out.println("For Modulo enter '%'\n");
        
//        scanf("%c", &operator);
        operator = sc.next().charAt(0);

        if (operator== '+')
        {
            System.out.println(num1 + " "+ operator+" " + num2 +" = "+ (num1 + num2));
        }
        else if (operator== '-')
        {
            System.out.println(num1 + " "+ operator+" " + num2 +" = "+ (num1 - num2));
        }
        else if (operator== '*')
        {
            System.out.println(num1 + " "+ operator+" " + num2 +" = "+ (num1 * num2));
        }
        else if (operator== '/')
        {
            System.out.println(num1 + " "+ operator+" " + num2 +" = "+ (num1 / num2));
        }
        else if (operator== '%')
        {
            System.out.println(num1 + " "+ operator+" " + num2 +" = "+ (num1 % num2));
        }
    }
}
