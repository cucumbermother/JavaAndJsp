package Team;

public class Member {
    private String name;
    private String id;
    private int point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Member(String name, String id , int point){
        this.id = id;
        this.name = name;
        this.point = point;
    }

    void showInfo (){
        System.out.printf("회원님의 ID는 %s, 이름은 %s, 누적포인트는 %d입니다", id, name, point);
    }

}
