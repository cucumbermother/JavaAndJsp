package Team;

public class MyFriendInfo { // 기본적인 정보들을 모은 클래스이다.
    private String name;
    private int age;
    // name과 age을 private으로 선언하여 외부에서 수정할 수 없도록한다. (데이터 보호)

    public MyFriendInfo(String name, int age){
        this.age = age;
        this.name = name;
        // 생성자를 통해 name과 age 필드를 초기화한다.
    }


    public void showInfo(){
        System.out.printf("이름 : %s%n나이 : %d%n" , name,age);
    }
    // 이것을 출력해내는 method를 생성한다

}

