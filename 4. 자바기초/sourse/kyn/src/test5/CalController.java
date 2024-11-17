package test5;

import java.util.ArrayList;

public class CalController {
    private final CalDao calDao = CalDao.getInstance();  // 싱글톤 인스턴스를 사용

    public boolean calWrite(int x, int y) {
        CalDto calDto = new CalDto(x, y);
        return calDao.calWrite(calDto);
    }

    public ArrayList<CalDto> calPrint() {
        return calDao.calList;
    }
}
