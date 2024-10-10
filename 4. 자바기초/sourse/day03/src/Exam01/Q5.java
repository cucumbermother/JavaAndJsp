package Exam01;

public class Q5 {
    public static void main(String[] args) {

        int i;
        int j;

        for(i = 2 ; i <= 9 ; i++){
            for (j = 1; j <= 9 ; j++){
                if (i > j){
                    continue;
                }
                System.out.println(i + "x" + j +"=" + i * j);
            }
        }
    }
}
