package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSevice7Test {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Board> boardList = new ArrayList<>();
    static void boardWrite() {
        System.out.println("작성자 작성 : "); String writer = sc.next();
        sc.nextLine();
        System.out.println("게시물 작성 : "); String content = sc.nextLine();
        System.out.println("비밀번호 작성 : "); int pwd = sc.nextInt();
        Board board = new Board(writer,content,pwd);
        boardList.add(board);
    }
    static void boardPrint() {
        for(Board board : boardList ) {
            System.out.println(board.toString());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. 게시물 작성 2. 게시물 확인");
            int choose = sc.nextInt();
            if(choose==1) {
                boardWrite();
            } else if (choose==2) {
                boardPrint();
            }
        }
    }
}
