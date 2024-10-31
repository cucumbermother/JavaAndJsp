package exam01;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>(5); // 공간 갯수 5로 설정
        System.out.println("배열 공간 갯수 : " + items.capacity()); // 5
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");
        System.out.println("배열 공간 갯수 : " + items.capacity()); // 5
        items.add("항목6");
        System.out.println("배열 공간 갯수 : " + items.capacity()); // 10
        items.add("항복7");
        items.add("항복8");
        items.add("항복9");
        items.add("항복10");
        items.add("항복11");
        System.out.println("배열 공간 갯수 : " + items.capacity()); // 20 => 2배로 늘어남
    }
}
