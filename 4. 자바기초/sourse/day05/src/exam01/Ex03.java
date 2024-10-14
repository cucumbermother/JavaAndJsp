package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student.id = 1000;
        Class cls = Student.class;

        Student s1 = new Student();
        s1.name = "김유나";
        s1.major = "수학";
        s1.showInfo();

        System.out.println(Math.PI);
}
}
