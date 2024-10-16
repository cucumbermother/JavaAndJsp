package Team;

public class test {
    public static void main(String[] args) {
        MyFriendDetailInfo friend = new MyFriendDetailInfo("도여이",22,"부평","010-5555-5555");
        // 객체를 만들고 초기화 할 값을 넣는다
        friend.ShowMyFriendDetailInfo();
        // MyFriendDetailInfo의 메서드인 ShowMyFriendDetailInfo를 호출한다
    }
}

//*** 실행결과 ***//

//이름 : 도여이
//나이 : 22
//주소 : 부평
//전화번호 : 010-5555-5555
