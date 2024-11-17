package test04;

import java.util.Scanner;

public class InputUser {
    MyInfo inputUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력!");
        String name = sc.next();
        System.out.println("나이 입력");
        int age = sc.nextInt();
        return new MyInfo(name,age);
    }
}
