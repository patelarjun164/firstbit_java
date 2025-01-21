package Assignment_2;

public class q1_grtstOf3 {
    public static void main(String[] args) {
        int a=10,b=20,c=30;

        if(a>b){
            if (a>c)
            {
                System.out.println("A is Greatest of three.");
            }
            else
            {
                System.out.println("C is Greatest of three.");
            }

        } else {
            if(b>c){
                System.out.println("B is Greatest of three.");
            }
            else {
                System.out.println("C is Greatest of three.");
            }
        }
    }
}
