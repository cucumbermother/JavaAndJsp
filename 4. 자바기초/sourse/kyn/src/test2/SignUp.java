package test2;

public class SignUp {
    String name;
    String id;
    String password;
    String email;

    public SignUp (String name, String id, String password){
       this.name = name;
       this.id = id;
       this.password = password;
        System.out.println("회원가입 성공");
    }

    void userInfo(){
        System.out.printf("이름 : %s , 아이디 : %s , 비밀번호 : %s , 이메일 %s%n", name,id,password,email);
    }
}
