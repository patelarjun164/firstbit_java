package Assignment_5_function;

import java.util.Scanner;

public class q4_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number u want to check prime of\n");
        num = sc.nextInt();
        // checkPrime(num);
        System.out.println(checkPrime(num) ? num +" is prime": num+" is NOT prime");
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i*i <= num ; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
