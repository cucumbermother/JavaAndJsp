package test2;

public class Test {
    public static void main(String[] args) {
        SignUp nyang = new SignUp("냥발자","nyang123","abc123");
        nyang.userInfo();
        nyang.email = "nyang123@test.org";
        nyang.userInfo();
    }
}
