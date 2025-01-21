package Assignment_3;
import java.util.Scanner;

public class q5_armStrongNUm {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:\n");
        num = sc.nextInt();
        int temp = num, sum = 0, count =0;

        //find length of number to find exponent
        while(temp>0){
            count++;
            temp /= 10;
        }
        System.out.println("Count = "+ count);

        //temp becomes 0, so ressign for further use
        temp = num;
        while (temp > 0)
        {
            int rem = temp % 10;
            //cal power of rem
            int power = 1, tempCount = count;
            for (int i = 1; i <= tempCount; i++)
            {
                power *= rem;
            }

            System.out.println("Power = "+ power);
            sum += power;
            temp /= 10;
        }

        System.out.println(sum==num ? "Num is armstrong num": "Num is not armstrong num");
    }
}
