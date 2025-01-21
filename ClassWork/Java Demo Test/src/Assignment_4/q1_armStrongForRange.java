package Assignment_4;
import java.util.Scanner;

public class q1_armStrongForRange {
    public static int findPower(int base , int exponent){
        int power = 1;
        while (exponent!=0)
        {
            power *= base;
            exponent--;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number upto which u want to armstrong nums:\n");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++)
        {
            int temp = i, sum = 0, count = 0;

            // find length of number to find exponent
            while (temp > 0)
            {
                count++;
                temp /= 10;
            }

            // temp becomes 0, so ressign for further use
            temp = i;
            while (temp > 0)
            {
                int rem = temp % 10;
                // cal power of rem
                int power = 1, exponent = count;
                sum += findPower(rem, exponent);
                temp /= 10;
            }

            if(sum == i) System.out.println(i + " ");
        }
    }
}
