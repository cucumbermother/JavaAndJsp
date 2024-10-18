package exam02.Nintendo;

public class AnimalForest extends Nintendo {
    AnimalForest(String nickname ) {
        super(nickname);
    }

    @Override
    void whatToDo() {
        System.out.println(nickname + "은/는 벌에 쏘였다!");
    } // 부모클래스가 추성메서드를 정의 했기 때문에 자식클래스는 꼭 메서드를 정의 해야만한다.
}
