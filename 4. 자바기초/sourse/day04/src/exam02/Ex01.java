package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1은 지역변수
        s1.id = 19990626;
        s1.major = Student.Major.국어국문과;
        s1.name = "김유나";
        s1.type = Student.Type.섹시;
        s1.showInfo();

        System.out.println(
                "s1 : " + System.identityHashCode(s1)
        );

        Student s2 = new Student();
        s2.name = "이용호";
        s2.major = Student.Major.불어과;
        s2.id = 19940915;
        s2.type = Student.Type.멋짐;
        s2.showInfo();
        System.out.println(
                "s2 : " + System.identityHashCode(s2)
        );
        Student s3 = new Student();
        s3.id = 748748;
        s3.major = Student.Major.일본어과;
        s3.name = "아이유";
        s3.type = Student.Type.귀여움;
        s3.showInfo();

        Student s4 = s2;
        s4.name = "(수정) 장원영";
        s4.showInfo();
        s2.showInfo();
        System.out.println(s2 == s4); //true 같은 자원을 공유

    }
}
