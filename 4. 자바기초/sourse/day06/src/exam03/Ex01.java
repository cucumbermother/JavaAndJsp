package exam03;

public class Ex01 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator();
        Calculator cal = new SimpleCalculator();
        int result = cal.add( 10, 20 );
        System.out.println(result);

        Calculator proCal = new ProCalculator();
        int result1 = proCal.multiplication(10,5);
        System.out.println(result1);

        System.out.println(cal.num);
    }
}
