package Assignment_7_array;

import java.util.Scanner;

public class q3_sumOfAll {
      public static int sum(int a, int b){
          return a+b;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:\n");
        n = sc.nextInt();

        int[] arr = new int [n];
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the value at index " + i);
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of all number of array is " + sum);
    }
}
