package Exam02;

public class ex04 {
    public static void main(String[] args) {
        int[] nums = /*new int[]*/ {10, 20 , 30, 40, 50, 60, 70}; // 선언과 동시에 초기화


//        int[] nums2;
//        nums2 = {10 , 20 ,30 , 40}; // error

        System.out.printf("length= %d%n", nums.length); // 배열안 공간의 갯수

//
//        for(int i = 0; i < nums.length; i++){ // <= 를 하고 length에 -1을 하는것보다 <(미만)을 쓰는게 관례이다
//            System.out.println(nums[i]);
//
//        }
        for (int num : nums){ // 향상된 for문
            System.out.println(num);
        }

    }
}

