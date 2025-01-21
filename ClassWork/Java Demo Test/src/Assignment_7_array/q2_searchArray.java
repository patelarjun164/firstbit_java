package Assignment_7_array;

import java.util.Scanner;

public class q2_searchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:\n");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the value at index "+ i);
            arr[i] = sc.nextInt();
        }
        int searchNum, flag= 1;
        System.out.println("Enter a number u want to search in array\n");
        searchNum = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            if(arr[i]==searchNum){
                System.out.println(searchNum + " is on index: " + i);
                flag = 0;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println(searchNum + " is not available in array\n");
        }
    }
}
