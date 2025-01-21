package Assignment_3;
import java.util.Scanner;

public class q7_checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:\n");
        num = sc.nextInt();

        int temp = num, rem, rev = 0;
        while (temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num +" is a Palindrome number");
        else
            System.out.println(num + " is NOT a Palindrome number");
    }
}
