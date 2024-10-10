package Exam01;

public class Q4 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9 ; i++){
            if (i % 2 == 0){ // 짝수단일때 건너뛰기 -> 홀수단만 출력
                continue;
            }
            System.out.printf("--- %d단 ---%n", i);
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d%n", i , j , i * j);
            }
        }
    }
}
