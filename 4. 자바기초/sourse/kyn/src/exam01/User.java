package exam01;

public class User { // kyn exam01.User
    String userName;
    int userAge;
    int year = 2024;

    public void showUserInfo(){
        System.out.println("--- "+year + "년도 기준 ---");
        System.out.println("이름 : " + userName);
        System.out.println("나이 : " + userAge + "살");
    }

}
