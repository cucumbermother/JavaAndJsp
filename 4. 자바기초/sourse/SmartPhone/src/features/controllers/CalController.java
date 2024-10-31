package features.controllers;

import features.calculator.*;
import features.games.Ab_Games;

import java.util.Scanner;

public class CalController extends Ab_Games {
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("어떤 계산을 하시겠습니까?");
        System.out.println("1.더하기 | 2.빼기 | 3.곱하기");
        int choice = sc.nextInt();
        if(choice == 1) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("첫번째 값을 넣어주세요");
            int result1 = sc2.nextInt();
            System.out.println("두번째 값을 넣어주세요");
            int result2 = sc2.nextInt();
            Ab_Calculator cal = new PlusCal();
            System.out.println();
            System.out.println("값은 " + cal.calculator(result1,result2)+"입니다.");
        } else if (choice == 2) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("첫번째 값을 넣어주세요");
            int result1 = sc2.nextInt();
            System.out.println("두번째 값을 넣어주세요");
            int result2 = sc2.nextInt();
            Ab_Calculator cal = new MinusCal();
            System.out.println();
            System.out.println("값은 " + cal.calculator(result1,result2) + "입니다.");
        } else if (choice == 3) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("첫번째 값을 넣어주세요");
            int result1 = sc2.nextInt();
            System.out.println("두번째 값을 넣어주세요");
            int result2 = sc2.nextInt();
            Ab_Calculator cal = new MulCal();
            System.out.println();
            System.out.println( "값은 " + cal.calculator(result1,result2) + "입니다.");
        }
    }
    }


