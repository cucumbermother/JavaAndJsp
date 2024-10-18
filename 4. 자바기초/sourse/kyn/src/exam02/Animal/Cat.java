package exam02.Animal;

public class Cat extends Animal {
    String cat_Color;



    public void color(){
        System.out.println(name+"의 색깔은 "+cat_Color);
    }


    public Cat(String name , String cat_Color) {
        super(name);
        this.cat_Color = cat_Color;
    }

    @Override
    void speak() {
        System.out.println(name + "가 야옹 합니다");;
    }
}
