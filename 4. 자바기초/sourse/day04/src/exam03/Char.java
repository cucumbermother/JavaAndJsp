package exam03;

public class Char {
    String nickName;
    Position position;
    Shoes shoes;

    enum Position{
        탑, 미드, 정글, 원딜, 서폿
    }
    String picChar;
    int level;
    enum Shoes{
        마법사의신발, 판금장화, 헤르메스의발걸음, 공생형밑창, 아이오니화의장화
    }
    double winrate;

    public Char(){
      position = Position.미드;
      shoes = Shoes.공생형밑창;
      nickName = "아무개";
      picChar = "티모";
    }
    void showInfo(){
        System.out.printf("안녕하세요 %s 소환사님! 협곡으로 돌아오셨군요!%n탁월한 선택이십니다! 당신이 선택한 캐릭터는 %s입니다.%n" +
                "소환사님의 %s의 승률은 %f 퍼센트 이며 숙련도 레벨은 %dLv입니다.%n" +
                "소환사님의 라인은 %s이시고 신발은 %s 을/를 추천합니다.%n즐거운 게임되세요!%n%n", nickName, picChar, picChar,winrate,
               level, position, shoes );
    }
}
