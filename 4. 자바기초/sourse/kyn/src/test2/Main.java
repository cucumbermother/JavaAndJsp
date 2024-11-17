package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoardServiceTest1 [] boardServiceTest1 = new BoardServiceTest1[100];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 게시물 쓰기 2. 게시물 출력 3. 게시물 수정 4. 종료");
            int choose = sc.nextInt();
            if(choose == 1 ){
                System.out.println("게시물 작성자 입력 : "); String writer = sc.next();
                System.out.println("게시물 작성자 비밀번호 입력(숫자) : "); int password = sc.nextInt();
                System.out.println("새로운 게시물 입력 : "); String content = sc.next();
                boolean isSave = false;
                for(int i = 0; i < boardServiceTest1.length; i++){
                    if(boardServiceTest1[i] == null) {
                        boardServiceTest1[i] = new BoardServiceTest1();
                        boardServiceTest1[i].content = content;
                        boardServiceTest1[i].writer = writer;
                        boardServiceTest1[i].password = password;
                        isSave = true;
                        break;
                    }
                }
                if(isSave) {
                    System.out.println("게시물 쓰기 성공");
                } else {
                    System.out.println("게시물 쓰기 실패 : 빈 공간이 없습니다.");
                }
            }
            if(choose == 2) {
                for(int i = 0; i <boardServiceTest1.length; i++){
                    if(boardServiceTest1[i] != null) {
                        System.out.printf("*** %d번째 게시물*** %n", i + 1 );
                        boardServiceTest1[i].boardServiceMethod();
                    }
                }
            }
            if(choose == 3 ) {
                System.out.println("몇번째 게시물을 수정하시겠습니까? : "); int findIndex = sc.nextInt();
                if(boardServiceTest1[findIndex - 1] != null) {
                    System.out.printf("%s님의 비밀번호를 입력해 주세요.%n",boardServiceTest1[findIndex-1].writer);
                    int correctPassword = sc.nextInt();
                    if (boardServiceTest1[findIndex-1].password == correctPassword) {
                        System.out.printf("%d번째 게시물의 수정내용을 적어주세요%n",findIndex);
                        boardServiceTest1[findIndex - 1 ].content = sc.next();
                    } else {
                        System.out.println("비밀번호가 틀렸습니다.");
                    }

                } else {
                    System.out.println("해당 순서의 게시물은 존재하지 않습니다.");
                }
            }
            if(choose == 4 ) {
                break;
            }
        }
    }
}