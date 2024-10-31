package features.controllers;

import java.util.Scanner;

public class MainController {
    public void maincontrollerStart(){
        System.out.println();

        System.out.println("--- 핸드폰 실행 ---");
        System.out.println("--- 메뉴---");
        System.out.println();
        System.out.println("1.계산기 | 2.운세보기 | 3.게임");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1 ){
            CalController calController = new CalController();
            System.out.println();
            calController.start();
        } else if (choice == 2) {
            FortuneController fortuneController = new FortuneController();
            System.out.println();
            fortuneController.start();
        } else if (choice == 3) {
            GameController gameController = new GameController();
            System.out.println();
            gameController.start();
        }
        else {
            System.out.println("올바른 번호를 입력해 주세요.");
        }
    }
}
