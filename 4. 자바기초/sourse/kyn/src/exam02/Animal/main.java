package exam02.Animal;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("또롱이", "흰색");
        /**
         * Dog 클래스의 객체를 생성 했다
         * Dog 클래스는 이제 Animal클래스에 있던 모든 자원들을 사용 가능하며
         * Dog 클래스 내부에서 새로히 생성한 자원들 또한 당연캐도 접근 가능하다
         * name변수와 name변수를 초기화 값으로 받는 생성자는 Animal 클래스에서 상속받았으며
         * dog_Color와 dog_Color를 초기화 값으로 받는 생성자는 dog클래스에서 새로히 정의되었다
         */

        Animal dog2 = new Dog("또롱쓰리","바둑이");
        /**
         * 이것이 다향성이다
         * 원래 같으면 Cat cat = new Cat() 이었을 객체생성을 Animal cat = new Cat()으로 새롭게 정의했다.
         * 위 dog객체와 다른점은 Overide에서 나타난다
         * 만약 Animal animal = new Animal()이라는 객체를 생성했다고 하자
         * animal객체는 자기 클래스의 자원인 name과 오버라이드 되지 않은 speak에만 접근할수 있을것이다
         * name값에 "또롱이"를 넣고 animal.speak(); 를 호출하면 "또롱이가 소리를 냅니다"라고 출력될 것이다
         * 하지만 Animal dog = new Dog();로 객체 생성을 하면
         * 접근할수 있는 자원들은 여전히 자신의 클래스인 자본밖에 없겠지만 speake()메서드만은 달라진다
         * dog클래스에서 오버라이드된 speak메서드인 "또롱이가 짖습니다"라고 출력이 될것이다.
         * 때문에 이것은 코드를 좀 더 유연하게 만들고 활용가치가 많을것이다
         */

        dog.speak();
        dog2.speak();
        dog.color();
//        cat.color(); // Animal 클래스의 자본만 접근 가능하므로 이것은 접근이 불가능 하다
    }
}
