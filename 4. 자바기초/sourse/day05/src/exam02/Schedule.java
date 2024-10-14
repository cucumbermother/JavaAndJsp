package exam02;

public class Schedule { // Public은 접근 제어자
   private int year;
   private int month;
   private int day;

    public void setYear(int _year){
        year = _year;
    }

    public int getYear() {
        return year;
    }
  public int getMonth() {
        return month;
    }
  public int getDay() {
        return day;
    }

    public void setMonth(int _month){
        month = _month;
    }

    public void setDay(int _day){
        if (month == 2 && _day > 28){   // 통제 가능
        _day = 28;
        }

        day = _day;
    }

    void showDate(){
        System.out.printf("%d년 %d월 %d일", year,month,day);
    }
}
