package exam02.Animal;

public class Dog extends Animal {
    /**
     * Dog class 는 Animal class에게 상속 받았다
     * Dog는 자식클래스가되고 Animal은 부모클래스가 된다
     * Dog는 Animal이 가지고 있는 생성자, 메소드(오버라이드), 인스턴스변수를 물려받게된다(자원을 물려받음)
     * 한편 Animal 클래스는 상속을 당한것이 아닌 해준것이기 때문에
     * Dog의 자원을 물려받지 못한다!
     */
    String dog_Color;

    public Dog(String name, String dog_Color) {
        super(name);
        this.dog_Color = dog_Color;

    }

    /**
     * Animal클래스의 생성자를 물려받은 Dog클래스는 당연하게도 Animal 클래스와 같이 name을 초기화 값으로 받게된다
     * 그렇다고 생성자를 수정하지 못하는것은 아니다
     * 위와 같이 dog_color라는 Dog클래스에만 존재하는 인스턴스변수를 생성하고
     * dog_Color라는 초기화 값 또한 name과 더불어 한번더 받기로하였다.
     */

    public void color(){
        System.out.println(name + "의 색깔은 " + dog_Color);
    }

    @Override
    void speak() {
        System.out.println(dog_Color + "의 털을 가진 " + name + "가 멍멍 합니다.");
    }


/**
     * Animal클래스의 메소드인 speak메소드 또한 그대로 물려받았다
     * 이것은 override를 하지 않은 상태이며 그저 부모의 메서드를 상속받은 상태임에 불과하다
     * 이것을 재정의 하는것이 override라고 한다 밑에 다시 override해보도록 하자
     */
}
