package Assignment_7_array;
import java.util.Scanner;

public class q4_oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:\n");
        n=sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the value at index "+ i);
            arr[i] = sc.nextInt();
        }

        //print even number
        System.out.println("--------Even Nums in Array-------\n");
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==0){
                System.out.println(arr[i] + " ");
            }
        }
        //print odd number
        System.out.println("\n--------Odd Nums in Array-------\n");
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==1){
                System.out.println(arr[i] + " ");
            }
        }
    }
}