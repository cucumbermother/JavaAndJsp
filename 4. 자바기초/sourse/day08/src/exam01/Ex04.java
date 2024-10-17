package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 { // day08 exam01.Ex04
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.text")) {
            System.out.println("파일 있음 해제완료");
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 없음 해제완료");
        }
    }
}
