package Assignment_1;

public class q3_sumOfDig {
    public static void main(String[] args){
        int temp = 123;
        int num = temp;
        int r1 = num %10; //3
        num = num /10; //12
        int r2 = num %10;
        int r3 = num /10;
        System.out.println("Sum of " + temp + " is " + (r1+r2+r3));
        System.out.println("Reverse num of "+ temp + " is " + ((r1*100)+(r2*10)+r3));
    }
}
