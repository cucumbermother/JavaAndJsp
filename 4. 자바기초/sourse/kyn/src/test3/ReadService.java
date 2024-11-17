package test3;

public class ReadService {
    // BoardContainer의 ArrayList 타입인 boardList의 모든 Board 객체를 출력하는 클래스
        void readService (BoardContainer boardContainer) {
        for( int i = 0; i < boardContainer.boardList.size(); i ++) {
            System.out.println(boardContainer.boardList.get(i).toString());
        }
    }
}
