package exam02;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try{
            service.process("user012","123s4");
            System.out.println("로그인 성공");
        } catch (PasswordValidationException | UserIdValidationException e){
            System.out.println(e.getMessage());
        }

    }
}
