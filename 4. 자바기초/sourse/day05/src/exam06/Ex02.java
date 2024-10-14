package exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        // throw new FileNotFoundException()...
       try {
           FileInputStream fis = new FileInputStream("b.text");
           System.out.println("정상 처리");
       } catch(FileNotFoundException e) {
           String message = e.getMessage();
           System.out.println(message); // b.text (지정된 파일을 찾을 수 없습니다)

           e.printStackTrace();
           System.out.println("🚨🚨 예외 발생 🚨🚨");
       }
        System.out.println("매우 중요한 실행 코드....");

    }
}
