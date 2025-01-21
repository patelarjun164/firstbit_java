package Assignment_2;
import java.util.Scanner;

public class q4_fisrtNLastDIgSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rem=0;
        num = sc.nextInt();
        System.out.println("num is" + num);

        int lastNo = num%10;
        while(num!=0){
            rem = num%10;
            num /= 10;
        }
        Math.pow(1.2, 2.5);
        System.out.println("addition is " + (lastNo+rem));
    }
}
