package exam01;

public class Test { // kyn exam01.Test
    public static void main(String[] args) {
        User user = new User();
        user.userName = "김유나";
        user.userAge = 26;
        user.showUserInfo();

        // 일년이 지났다고 가정

        user.userAge ++;
        user.year ++;
        user.showUserInfo();
    }
}
