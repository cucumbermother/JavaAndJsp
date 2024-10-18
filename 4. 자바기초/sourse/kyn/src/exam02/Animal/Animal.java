package exam02.Animal;

public class Animal {
    String name; // 인스턴스 변수를 정의

    public Animal(String name){
        this.name = name; // 생성자 정의
    }

    void speak(){
        System.out.println(name + "가 소리를 냅니다"); // 메소드 정의
    }
}
