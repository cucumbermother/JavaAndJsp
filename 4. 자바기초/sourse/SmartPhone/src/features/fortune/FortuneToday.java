package features.fortune;

import java.util.Scanner;

public class FortuneToday implements Fortune {


    @Override
    public void blood_typeFortune() {
        System.out.println("1~4번 중에서 골라주세요");
        System.out.println("1.A형 | 2.B형 | 3.O형 | 4.AB형");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("오늘 운세가 좋으시네요");
        } else if (choice == 2) {
            System.out.println("오늘 운세가 안좋으십니다");
        } else if (choice == 3) {
            System.out.println("오늘 운세는 그럭저럭");
        } else if (choice == 4) {
            System.out.println("오늘 운세 초대박");
        } else {
            System.out.println("번호를 잘못 입력하셨습니다");
        }
    }

    @Override
    public void zodiacFortune() {
        System.out.println("띠를 골라주세요");
        System.out.printf("1.쥐띠%n2.소띠%n3.범띠%n4.토끼띠%n5.용띠%n6.뱀띠%n7.말띠%n8.양띠%n" +
                "9.원숭이띠%n10.닭%n11.개%n12.돼지%n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println();
        if(choice == 1 || choice == 5 || choice == 10){
            System.out.println("오늘은 행복한 날이 될거에요!");
        } else if (choice == 2 || choice == 6 || choice == 12) {
            System.out.println("오늘은 집안에만 있으세요!");
        } else if (choice == 3 || choice == 7 ) {
            System.out.println("오늘 금전운이 좋습니다!");
        } else if (choice == 4 || choice == 8 ){
            System.out.println("오늘 특별한 사랑을 만나겠네요!");
        } else if (choice == 9 || choice == 11) {
            System.out.println("오늘은 친구랑 싸울수도 있겠네요..!");
        }

    }
}
