package Assignment_3;
import java.util.Scanner;

public class q6_findFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1;
        System.out.println("Enter a number:\n");
        num = sc.nextInt();

        int temp =num;

        for(int i=num; i>0;i--){
            fact *= i;
        }
        System.out.println(temp + "! = " + fact);
    }
}
