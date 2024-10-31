package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = ( x, y) -> x + y;
        System.out.println(cal.plus(5,6));

    }
}
