package Assignment_1;

public class q8_swapping {
    public static void main(String[] args) {
        int a =2, b = 3, temp;
        // ---before swapping----
        System.out.println("---before swapping----");
        System.out.println("a=" + a +", b="+ b);

        //---after swapping----
        temp = a;
        a = b;
        b = temp;
        System.out.println("---after swapping----");
        System.out.println("a=" + a +", b="+ b);
    }
}
