package Assignment_3;
import java.util.Scanner;

public class q2_printTable {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Any Number u want to print table of");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
