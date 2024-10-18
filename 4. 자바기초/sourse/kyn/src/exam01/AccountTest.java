package exam01;

public class AccountTest { // kyn exam01.AccountTest
    public static void main(String[] args) {
        Account account = new Account();
        int UserAccount = account.getAcount();
        System.out.println(UserAccount); // 100000


        // 이자 계산을 해보자

        int money = UserAccount * 2 * 2 * 2;
        System.out.println(money); // 800000

    }

    }

