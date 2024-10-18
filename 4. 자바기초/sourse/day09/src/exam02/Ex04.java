package exam02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
//        StringBuffer sb2 = sb.append("ABC");
//        StringBuffer sb3 = sb2.append("DEF");
//        StringBuffer sb4 = sb2.append("GHI");
//        String str = sb4.toString();
//        System.out.println(str); //ABCDEFGHI
//        System.out.println(sb == sb4); // true

        String str2 = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();
        System.out.println(str2); // ABCDEFGHI


    }
}
