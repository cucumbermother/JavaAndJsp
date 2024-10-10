package Exam03;

public class ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 20240626;
        s1.major = "호텔경영과";
        s1.name = "김유나";
        s1.study();

        Student s2 = new Student();
        s2.id = 20240915;
        s2.major = "실용음악과";
        s2.name = "이용호";
        s2.study();
    }
}
