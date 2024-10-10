package Exam02;

public class ex05 {
    public static void main(String[] args) {
        int[] nums1 = { 10, 20, 30, 40 };
        int[] nums2 = nums1;
        nums2[1] = 22;
        System.out.println(nums1[1]); // 22 // 똑같은 자원을 같은 주소로 이용하기 때문에 값이 같음

        int a = 1;
        int b = a;
        b = 3;
        System.out.println(a);
    }
}
