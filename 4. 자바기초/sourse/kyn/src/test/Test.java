package test;

public class Test {
    public static void main(String[] args) {
        Me lee = new Me();
        lee.name = "이멍멍";
        lee.age = 21;
        lee.favorite = "산책하는 것";
        lee.introduce();
        // 저의 이름은 이멍멍, 나이는 21이며 좋아하는것은 산책하는 것입니다.

        Me lee2 = new Me();
        lee2.name = "이멍멍";
        lee2.age = 21;
        lee2.favorite = "산책하는 것";
        lee2.introduce();

        System.out.println( lee == lee2); //false
    }
}
