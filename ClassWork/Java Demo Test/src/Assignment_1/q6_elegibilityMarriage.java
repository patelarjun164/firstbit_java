package Assignment_1;

public class q6_elegibilityMarriage {
    public static void main(String[] args) {
        int age = 22;
        char gender = 'M';
        if(gender == 'M') {
            System.out.println(age>=21 ? "Eligible for marriage": "Not eligible for marriage");
        } else {
            System.out.println(age>=18 ?"Eligible for marriage" : "Not eligible for marriage");
        }
    }
}
