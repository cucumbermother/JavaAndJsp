package exam01;

public class Student {
    static int id;
    String name;
    String major;

    void showInfo(){
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }

    static void staticMethod(){
        System.out.println("정적 메서드!");
        id = 1000;
        staticMethod2();
    }

    static void staticMethod2(){

    }

    public Student(){

    } // 없으면 안되는 필수 구성요소기 때문에 생성한다
}
