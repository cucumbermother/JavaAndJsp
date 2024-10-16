package Team;

public class MyFriendDetailInfo extends MyFriendInfo { 
    // 좀 더 디테일한 정보들을 모은 클래스이다
    private String addr;
    private String phone;
    // 이 역시 절대 데이터가 손상되면 안되는 변수들 이므로 private를 붙인다

    public MyFriendDetailInfo(String name, int age, String addr, String phone) {
        super(name, age); // 부모 클래스의 생성자를 호출하여 name과 age를 초기화한다
        this.addr = addr;
        this.phone = phone;
    }
    // 생성자를 통해 addr과 phone 필드를 초기화한다.

    public void ShowMyFriendDetailInfo()
    {
        showInfo();  // MyFriendInfo 클래스를 상속받았기 때문에 부모 클래스의 메서드인 showInfo를 호출할 수 있다
        System.out.printf("주소 : %s%n전화번호 : %s%n" , addr,phone);
        // 결국 이 ShowMyFriendDetailInfo() 메서드는 이 모든것을 출력할 수 있는 메서드라고 할수있다
    }
}
