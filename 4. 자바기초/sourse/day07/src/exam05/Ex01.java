package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        System.out.println(Outer.Inner.num);
        System.out.println(inner.num2);
        inner.method();
    }
}
