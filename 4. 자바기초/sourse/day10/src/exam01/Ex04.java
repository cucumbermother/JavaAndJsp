package exam01;

import static exam01.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(Transportation.BUS.getTitle()); // 버스
        System.out.println(Transportation.SUBWAY.getTitle()); // 지하철
        System.out.println(Transportation.TAXI.getTitle()); // 택시
        System.out.printf("버스 10명 : %d원%n",BUS.getTotal(10)); // 15000원
        System.out.printf("지하철 10명 : %d원%n", SUBWAY.getTotal(10)); // 14000원
        System.out.printf("택시 10명 : %d원%n", TAXI.getTotal(10)); // 45000원
    }
}
