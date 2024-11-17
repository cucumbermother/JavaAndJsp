package test3;

public class WriteService {
    // 사용자에게 Board 멤버변수의 초기화 값을 입력받아 Board 생성자에 입력후 객체를 생성후 반환하는 클래스
    Board writeService () {
        Router.scan.nextLine();
        System.out.println("내용 : "); String content = Router.scan.nextLine();
        System.out.println("작성자 : "); String writer = Router.scan.next();
        System.out.println("비밀번호 : "); int pwd = Router.scan.nextInt();
        return new Board(writer,pwd,content);
    }
}
