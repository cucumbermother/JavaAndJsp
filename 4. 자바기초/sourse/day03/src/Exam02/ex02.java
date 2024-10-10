package Exam02;

public class ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int 자료형 4개 생성
        System.out.println(nums); // 배열 시작지점 주소

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        for (int i = 0; i <= 3; i++){
            System.out.println(nums[i]);
        }

//        System.out.println(nums[0]); // 10
//        System.out.println(nums[1]); // 20
//        System.out.println(nums[2]); // 30
//        System.out.println(nums[3]); // 40
    }
}
