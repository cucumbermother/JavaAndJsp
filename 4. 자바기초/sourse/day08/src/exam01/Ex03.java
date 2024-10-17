package exam01;


import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 { // day08 exam01.Ex03
    public static void main(String[] args) {
        FileInputStream fis  = null;
        try {
            fis = new FileInputStream("b.text");

        } catch (IOException e) {
            e.printStackTrace();
       } finally {
            if (fis != null){
                // 예외가 있던 없던 항상 자원 해제
                try {
                    fis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제!");
        }

    }
}
