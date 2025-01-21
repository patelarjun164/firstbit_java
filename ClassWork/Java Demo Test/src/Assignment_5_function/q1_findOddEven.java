package Assignment_5_function;

import java.util.Scanner;

public class q1_findOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter Number:\n");
        num = sc.nextInt();
        // checkEvenOdd() ? System.out.println("Even Number\n") : System.out.println("Odd Number\n");
        System.out.println(checkOddEven(num) ? num + " is even number" : num + " is odd number");
    }

    public static boolean checkOddEven(int num) {
        return (num%2==0);
    }
}
