package exam04;

public class EX02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;
        // java.lang.Enum 하위 클래스 임을 체크?
        System.out.println(trans instanceof Enum<?>);
        Enum<Transportation> tran2 = trans;
    }
}
