package exam01;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

//        for (int i = 0; i <items.size(); i++){
//            items.remove(i);
//            i -= 1;
//
//        }

        for (int i = items.size() -1; i >= 0; i--) {
            String item = items.remove(i); // 삭제한 요소들 확인
            System.out.printf("꺼낸 요소 : %s%n", item);
        } // 효율적으로 삭제되는 방법

        for (int i = 0; i < items.size(); i++ ){
            String item = items.get(i);
            System.out.println(item);
        }
    }
}
