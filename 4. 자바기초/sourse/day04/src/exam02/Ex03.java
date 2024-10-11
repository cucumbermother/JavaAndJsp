package exam02;


public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1001,"김이름");
        Student s2 = new Student(1002, "박이름"); // 생성자 오버로드

        s1.showInfo();
        s2.showInfo();

        Class cls = Student.class;
    }
}
