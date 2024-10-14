package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2022,10,26);
        s1.printThis(); // exam02.Schedule2@2f4d3709
        System.out.println(s1); // exam02.Schedule2@2f4d3709
        System.out.println(s1 == s1.getThis()); // true
        Schedule2 _this = s1.getThis();
        System.out.println("s1 : " + System.identityHashCode(s1)); //s1 : 793589513
        System.out.println("this : " + System.identityHashCode(_this)); // this : 793589513

    }
}
