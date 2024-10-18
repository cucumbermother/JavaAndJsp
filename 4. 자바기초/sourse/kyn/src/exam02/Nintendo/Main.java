package exam02.Nintendo;

public class Main {
    public static void main(String[] args) {
        Nintendo animalFrest = new AnimalForest("유나띠");
        Nintendo mario = new Mario("오이");
        Nintendo pocketmon = new Pocketmon("지우");
        /**
         * 이로써 세 각기 다른 클래스는 다른 동작(메서드)를 수행하지만
         * Nintendo의 자식 클래스로써 name변수를 필수적으로 받고 하나의 동작(메서드)를 정의해야만 하는것까지
         * 일관성이 있는 클래스들의 모임이 되었다.
         * 닌텐도에서 게임(메서드)을 (수행)한다. 라는 공통된 목적 혹은 로직을 가지고 있다.
         * 추상클래스와 추상메서드는 이것을 위해 존재한다.
         * 닌텐도는 가이드라인(생성자, 메서드)를 제공하고 게임의 내용은 게임회사에게 맡기는 것이다.
         */

        animalFrest.whatToDo();
        mario.whatToDo();
        pocketmon.whatToDo();
    }
}

