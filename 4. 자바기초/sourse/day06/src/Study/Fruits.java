package Study;

public class Fruits {
    public static String appleStatic = "apple";
    public String apple = "apple";

    public static void eatStatic (){
        System.out.println(appleStatic);
        //System.out.println(apple); // error
    }

    public void eat (){
        System.out.println(appleStatic);
        System.out.println(apple);
    }


}
