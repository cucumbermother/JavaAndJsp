package exam02.Nintendo;

public class Pocketmon extends Nintendo{
    @Override
    void whatToDo() {
        System.out.println(nickname+"은/는 야생의 또도까스를 포획했다!");;
    }


    Pocketmon(String nickname) {
        super(nickname);


    }


}
