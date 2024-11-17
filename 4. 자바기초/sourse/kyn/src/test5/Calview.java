package test5;

import java.util.Scanner;

public class Calview {
    Scanner sc = new Scanner(System.in);
    CalController calController = new CalController();  // 한 번만 생성하여 사용

    public void mainpage() {
        while (true) {
            System.out.println("1. 더하기 2. 더한 목록 보기");
            int choose = sc.nextInt();
            if (choose == 1) {
                calWrite();
            } else if (choose == 2) {
                calPrint();
            }
        }
    }

    void calWrite() {
        System.out.println("첫번째 수 입력");
        int num1 = sc.nextInt();
        System.out.println("두번째 수 입력");
        int num2 = sc.nextInt();

        boolean result = calController.calWrite(num1, num2);
        if (result) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

    void calPrint() {
        for (int i = 0; i < calController.calPrint().size(); i++) {
            System.out.println(calController.calPrint().get(i).toString());
        }
    }
}
