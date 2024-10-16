package exam08;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] odds = Arrays.stream(nums).filter( x -> x % 2 == 1).toArray();
        System.out.println(Arrays.toString(odds));
    }
}
    