package Study;

public class Print {
    public String deli = "";

    public Print (String deli){
        this.deli = deli;
    }

    public void printA(){
        System.out.println(deli);
        System.out.println("A");
        System.out.println("A");
    }

    public void printB(){
        System.out.println(deli);
        System.out.println("B");
        System.out.println("B");
    }
}
