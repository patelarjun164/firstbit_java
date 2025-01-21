package Assignment_7_array;

import java.util.Scanner;

public class q1_minMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array\n");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the value at index " + i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Value at index" + i + arr[i]);
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number in array is :" + max);
        System.out.println("Smallest number in array is :" + min);
    }
}