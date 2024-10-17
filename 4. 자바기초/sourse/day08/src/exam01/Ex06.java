package exam01;

public class Ex06 {
    public static void main(String[] args) {
        try(MyResource r1 = new MyResource();
            MyResource2 r2 = new MyResource2()) {
        }catch (Exception e){

        }
    }
}
