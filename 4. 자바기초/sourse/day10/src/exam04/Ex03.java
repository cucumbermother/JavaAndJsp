package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); // Fruits & Eatable
        // Box<Grape> grapeBox = new Box<>(); // Fruits
        Box<Fruit> fruitBox = new Box<Fruit>();
        fruitBox.setItem(new Grape());
        fruitBox.setItem(new Apple());

    }
}
