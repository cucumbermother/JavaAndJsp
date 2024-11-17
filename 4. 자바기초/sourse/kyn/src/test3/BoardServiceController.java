package test3;

public class BoardServiceController {
    // 사용자가 메뉴를 선택해 게시물 입력 또는 조회를 할 수 있도록 제어하는 클래스
    void boardServiceController(WriteService writeService , ReadService readService, BoardContainer boardContainer){
        while (true) {
            System.out.println("1. 글쓰기 2. 글출력 3. 종료 : ");
            int choose = Router.scan.nextInt();
            if(choose == 1 ) {
                boardContainer.boardContainer(writeService);
            } else if (choose == 2 ) {
                readService.readService(boardContainer);
            } else if (choose == 3) {
                break;
            }
        }
    }
}
