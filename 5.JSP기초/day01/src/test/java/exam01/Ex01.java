package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.member.Member;

public class Ex01 {

//    @Test
//    void test1() {
//        Member member = new Member("duwkrladbsk@naver.com","123aaa");
////        member.setSeq(1L);
////        member.setEmail("duwkrladbsk@naver.com");
////        member.setPassword("123ds4d5");
//        member.setSeq(1L);
//        member.setPassword("tlqkf!1");
//        System.out.println(member);
//
//    }


    @Test
    void test2 (){
        //Member member = new Member();
        Member member = Member.builder()
                .seq(1L)
                .email("duwkrladbsk@naver.com")
                .password("12235")
                .build();

        System.out.println(member);
    }
}
