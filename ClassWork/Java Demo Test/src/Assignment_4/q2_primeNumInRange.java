package Assignment_4;
import java.util.Scanner;

public class q2_primeNumInRange {
    public static void checkPrime(int num){
        boolean isPrime=true;
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("Enter number upto which u want to check prime of\n");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++)
        {
            checkPrime(i);
        }
    }
}
