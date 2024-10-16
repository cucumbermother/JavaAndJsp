package Study;

public class Introduce { // 멤버변수 = 필드
    String name;
    int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Introduce (String name, String address , int age){
        System.out.println("자기 소개 시작하겠습니다");

        System.out.println("자기소개 끝");
        this.address = address;
        this.name = name;
        this.age = age;
    }

    void  ShowInfo (){ // 메서드
        System.out.printf("제 이름은 %s이고 나이는 %d 사는곳은 %s 입니다.%n",name,age,address);
    }


}
