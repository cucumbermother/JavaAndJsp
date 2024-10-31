package features.controllers;

import features.fortune.FortuneToday;

import java.util.Scanner;

public class FortuneController extends FortuneToday{
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("어떤 운세를 보시겠습니까?");
        System.out.println("1.혈액형별 운세 2.띠별 운세");
        int choice = sc.nextInt();
        if (choice == 1 ){
            blood_typeFortune();
        } else if (choice == 2) {
            zodiacFortune();
        } else {
            System.out.println("잘못 입력하셨습니다");
        }
    }
}
