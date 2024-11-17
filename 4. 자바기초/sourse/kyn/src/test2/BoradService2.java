package test2;

import test3.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoradService2 {
    public static void main(String[] args) {
        // - 입력 객체
        Scanner scan = new Scanner(System.in);
        // - 컬렉션 프레임워크중 ArrayList 클래스를 이용한 배열타입 대체한다.
        // 배열(고정길이) vs 컬렉션프라임워크(가변길이)

        ArrayList<Board> boardList = new ArrayList<>();
        // ArrayList<제네릭 타입> : 리스트 객체에 저장할 여러개 객체들의 타입
        // 현제 게시물 수를 저장하는 변수
        while (true) {
            System.out.println("1. 글쓰기 2. 글출력 3. 종료 : ");
            int choose = scan.nextInt();
            if(choose == 1){
                // [1] 사용자로부터 저장할 데이터 입력 받음
                scan.nextLine(); // 의미없는 nextLine() 입력
                // 사용자로 부터 저장할 데이터를 입력 받는다.
                System.out.println("내용 : "); String content = scan.nextLine();
                // .next() 문자열(공백X) 입력, .nextLine() 문자열 (공백/띄어쓰기 포함) 입력
                System.out.println("작성자 : "); String writer = scan.next();
                System.out.println("비밀번호 : "); int pwd = scan.nextInt();
                // 새로운 배열내 마지막 인덱스에 입력받은 게시물 객체 등록
                // [2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board(writer,pwd,content);

                // [3] 컬렉션 프레임워크인 리스트객체에 게시물을 저장
                boardList.add(board);

            }else if(choose == 2 ){
                // 배열 내 존재하는 게시물 모두 출력하기
                for( int i = 0; i < boardList.size()  ; i ++) {
                    System.out.println(boardList.get(i));
                }
            } else if (choose == 3 ){
                System.out.println("시스템 종료");
                break;
            }

        }
    }
}
