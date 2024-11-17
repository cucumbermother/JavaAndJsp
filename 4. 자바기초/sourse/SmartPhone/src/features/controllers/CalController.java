package features.controllers;

import features.calculator.*;
import features.games.Ab_Games;

import java.util.Scanner;

public class CalController extends Ab_Games {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("어떤 계산을 하시겠습니까?");
        System.out.println("1.더하기 | 2.빼기 | 3.곱하기");
        int choice = sc.nextInt();

        Ab_Calculator cal;
        switch (choice) {
            case 1 -> cal = new PlusCal();
            case 2 -> cal = new MinusCal();
            case 3 -> cal = new MulCal();
            default -> {
                System.out.println("잘못된 선택입니다.");
                return;
            }
        }
        calculate(cal);
    }

    private void calculate(Ab_Calculator cal) {
        System.out.println("첫번째 값을 넣어주세요");
        int result1 = sc.nextInt();
        System.out.println("두번째 값을 넣어주세요");
        int result2 = sc.nextInt();
        System.out.println("값은 " + cal.calculator(result1, result2) + "입니다.");
    }
}
