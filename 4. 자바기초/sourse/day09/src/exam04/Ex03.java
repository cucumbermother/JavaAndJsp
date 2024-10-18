package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        String transStr = trans.name(); trans.toString();
        System.out.println(transStr);
        int ordinal = trans.ordinal();
        System.out.println(ordinal); // 상수가 정의된 순서 위치 번호
    }
}
