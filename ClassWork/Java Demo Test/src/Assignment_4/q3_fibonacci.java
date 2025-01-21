package Assignment_4;
import java.util.Scanner;

public class q3_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, first =0, second = 1, next = 0;
        System.out.println("Enter a number\n");
//        scanf("%d", &num);
        num = sc.nextInt();

        while (next<=num)
        {
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;
        }
    }
}
