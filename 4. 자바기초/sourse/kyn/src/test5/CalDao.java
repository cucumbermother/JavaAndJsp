package test5;

import java.util.ArrayList;

public class CalDao {
    // 유일한 인스턴스를 생성
    private static CalDao instance = new CalDao();

    // 외부에서 인스턴스를 생성하지 못하게 private 생성자
    private CalDao() {}

    // 유일한 인스턴스를 반환하는 메서드
    public static CalDao getInstance() {
        return instance;
    }

    // 데이터베이스 역할을 하는 리스트
    ArrayList<CalDto> calList = new ArrayList<>();

    public boolean calWrite(CalDto calDto) {
        calList.add(calDto);
        return true;
    }
}
