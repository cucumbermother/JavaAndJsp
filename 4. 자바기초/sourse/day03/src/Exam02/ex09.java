package Exam02;

public class ex09 {
    public static void main(String[] args) {
//        int[][] nums = new int[][]{
//                {10,20,30},
//                {40,50,60}
//        };
        int[][] nums = {{10,20,30,40},{50,60,70,80}};
        System.out.printf("nums.length = %d%n", nums.length); // 2
        System.out.printf("nums[0].length = %d%n", nums[0].length); // 4

        int[] nums1 = nums[0];
        nums1[1] = 22; // 바뀜
        System.out.println(nums1 == nums[0]); // ture

        for(int i = 0; i < nums.length; i++) { // 0행 , 1행
            for (int j = 0; j < nums[i].length; j++ ){ // 0열 , 1열 , 2열
                System.out.printf("%d행, %d열 = %d%n", i , j , nums[i][j]);
            }
        }
    }
}
