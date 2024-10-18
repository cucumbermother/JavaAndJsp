package exam02.Nintendo;

public abstract class Nintendo { // abstract는 추상 클래스와 추상 메서드를 사용할때 사용하는 키워드이다
    String nickname;

    Nintendo(String nickname){
        this.nickname = nickname;
    }

    abstract void whatToDo(); // 추상 메서드를 생성
}
