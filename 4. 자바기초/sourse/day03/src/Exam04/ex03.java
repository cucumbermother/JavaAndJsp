package Exam04;

public class ex03 {
    public static void main(String[] args) {
        System.out.println(word("happy"));

    }
    static String word(String x){
        String lower = x.toLowerCase();
        String upper = x.toUpperCase();

        if (lower ==x ){
            x = x.toUpperCase();
        } else if (upper == x) {
            x = x.toLowerCase();
        }
        return x;
    }

}
