package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 객체가 만들어짐
        // new 는 메모리를 생성해주는 역할
        // s1 은 지역변수
        s1.id = 454454;
        s1.major = "호텔경영과";
        s1.name = "김유나";
        s1.showInfo();
    }
}
