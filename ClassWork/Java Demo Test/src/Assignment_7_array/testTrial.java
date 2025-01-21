package Assignment_7_array;
import java.util.Arrays;

public class testTrial {
    public static int sum(int a){
        return a;
    }

    public static int[] findMax(int[] arr){
        arr[0] = 15;
        return arr;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(intArray));
        int[] res = findMax(intArray);
        System.out.println(Arrays.toString(res));
    }
}