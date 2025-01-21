package Assignment_5_function;

import java.util.Scanner;

public class q3_basicOperations {
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

        // fflush(stdin);
        operator = sc.next().charAt(0);
        System.out.println(num1 +" "+ operator +" "+ num2+" = " + showChoices(num1, num2, operator));
    }

    private static int showChoices(int num1, int num2, char operator) {
        if (operator == '+')
            return num1 + num2;
        else if (operator == '-')
            return num1 - num2;
        else if (operator == '*')
            return num1 * num2;
        else if (operator == '/')
            return num1 / num2;
        else if (operator == '%')
            return num1 % num2;

        return 0;
    }
}
