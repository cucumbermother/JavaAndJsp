package exam02.Nintendo;

public class Mario extends Nintendo {
    Mario(String nickname) {
        super(nickname);
    }

    @Override
    void whatToDo() {
        System.out.println(nickname+"님 피치공주를 구하러 갑시다!");
    }
}
