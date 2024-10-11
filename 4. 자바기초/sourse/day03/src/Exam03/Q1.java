package Exam03;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        int user = 20;
        int[] nums = new int[user];
        for ( int i = 1; i <= nums.length  ; i++ ){
            nums[i-1] = i;
            System.out.println(nums[i-1]);
        }

    }
}
