package Exam03;

public class Ex04 {
    public static void main(String[] args) {
        int total = 0;
        for ( int i = 1; i <= 100 ; i++) {
//            total += i;
//            if ( i == 50 ){
//                continue;
//            }
//            if (i % 2 == 1) { //홀수만 더하기
//                total += i;
//            }
            if (i % 2 == 0){
                continue;
            }
            total += i;
        }
        System.out.println(total);
    }
}
