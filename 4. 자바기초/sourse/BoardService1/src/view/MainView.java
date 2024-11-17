package view;

import java.util.Scanner;

public class MainView {
    public Scanner sc = new Scanner(System.in);
    public void mainPage() {
        while (true) {
            System.out.println("1. 회원가입 2. 로그인 3. 종료");
            System.out.println("번호를 입력하세요.");
            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("보기에 있는 숫자만 눌러주세요.");
                sc.nextLine();
                continue;
            }
            switch (choose) {
                case 1 :
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    return ;
            }

        }
    }
}
