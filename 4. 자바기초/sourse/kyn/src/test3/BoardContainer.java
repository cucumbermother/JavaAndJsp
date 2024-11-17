package test3;

import java.util.ArrayList;

public class BoardContainer {
    // writeService 메서드에서 생성한 Board 객체를 ArrayList타입인 boardList에 추가하는 클래스
    ArrayList<Board> boardList = new ArrayList<>();
    void boardContainer(WriteService writeService){
        boardList.add(writeService.writeService());
    }
}
