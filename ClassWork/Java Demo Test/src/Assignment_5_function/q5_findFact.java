package Assignment_5_function;
import java.util.Scanner;

public class q5_findFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println(num + "! = " + findFact(num));
    }

    public static int findFact(int num) {
        int fact=1;
        while(num>1){
            fact *= num;
            num--;
        }
        return fact;
    }
}
