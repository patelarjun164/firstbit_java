package Assignment_3;
import java.util.Scanner;

public class q3_sumOfNumINRagne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower, upper, sum=0;
        System.out.println("Enter num from which u want sum(Lower limit)");
        lower = sc.nextInt();
        System.out.println("Enter num to which u want sum(Upper limit)");
        upper = sc.nextInt();
        
        for (int i = lower; i <= upper; i++)
        {
            sum += i;
        }

        // System.out.println("Sum of numbers from %d to %d is %d", lowerTemp, upperTemp, sum);
        System.out.println("Sum of numbers is " + sum);
    }
}
