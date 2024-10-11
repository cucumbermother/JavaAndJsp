package exam02;

// exam02.Student : 전체 클래스명

class Student {
    int id;
    String name;
    Major major; // Enum 타입으로 필드 정의
    Type type;

    enum Type{
        귀여움, 섹시, 멋짐
    }
    // Enum 정의
    enum Major {
        국어국문과, 일본어과, 불어과
    }

    public Student(int _id, String _name){
        id = _id;
        name = _name;

    }

    void showInfo() {
        System.out.printf("ID: %d, 이름: %s, 타입 : %s ,전공: %s\n ", id, name, type ,major);
    }


    /**
     *따로 정의 하지 않으면 기본 생성되는 생성자
     * 디퐇트 생성자
     */
    public Student(){ // 기본 생성자, 따로 정의 x -> 컴파일러가 자동 추가, 디폴드 생성자
        // 객체 생성 이후 실행
        // 객체의 변수의 값 초기화
        id = 1999;
        name = "김유나";
        major = Major.불어과;
    }
}