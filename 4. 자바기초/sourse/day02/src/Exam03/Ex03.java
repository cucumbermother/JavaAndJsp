package Exam03;

public class Ex03 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1 /*초기화식*/ , j = 0; i <= 100;/*조건식*/ i++/*증감식*/ , j--){
           total += i;
            System.out.println(j);
        }
        System.out.println(total); // 5050
    }
}
