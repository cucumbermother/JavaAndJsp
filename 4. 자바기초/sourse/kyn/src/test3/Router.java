package test3;

import java.util.Scanner;

public class Router {
    // static으로 Scanner 객체 생성 모든 클래스에서 활용 가능!
    // 다른 클래스에서 필요한 의존 객체들을 이곳에서 생성
    static Scanner scan = new Scanner(System.in);
    void router() {
        WriteService writeService = new WriteService();
        ReadService readService = new ReadService();
        BoardContainer boardContainer = new BoardContainer();
        BoardServiceController boardServiceController = new BoardServiceController();
        boardServiceController.boardServiceController(writeService, readService, boardContainer);
    }
}