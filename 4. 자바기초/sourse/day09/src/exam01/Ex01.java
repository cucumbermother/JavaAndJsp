package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class<Person> cls = Person.class; // Person 클래스 정보확인
        System.out.println("---- 생성자 ----");
        for (Constructor constructor : cls.getConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("---- 멤버 변수 ----");
//        for(Field field : cls.getFields()){
//            System.out.println(field);
//        } // private자원이라 접근 불가

        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);} // 접근 가능


            System.out.println("---- 메서드 ----");
            for (Method method : cls.getMethods()) {
                System.out.println(method);
            }
        }
    }
