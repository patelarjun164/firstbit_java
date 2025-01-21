package Assignment_2;
import java.util.Scanner;

public class q3_discountForStudent {

    public static int main(String[] args) {
        char isStudent;
        double price;
        int discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter price: ");
//        scanf("%f", &price);
        price = sc.nextDouble();

        System.out.println("If your are student than press 'Y', else press 'N'\n");
//        fflush(stdin);
//        scanf("%c", &isStudent);
        isStudent = sc.next().charAt(0);

        // check validation
        if(isStudent=='y' || isStudent=='Y'){
            discount = price > 500 ? 20 : 10;
        }
        else if(isStudent=='n' || isStudent=='N'){
            discount = price > 600 ? 15 : 0;
        }
        else {
            System.out.println("Invalid choice for student elligibility\n");
            return 0;
        }

        System.out.println("You got Discount " + discount);
        System.out.println("You have to pay " + (price - (price * discount) / 100)+ " Rs");
        return 0;
    }
}
