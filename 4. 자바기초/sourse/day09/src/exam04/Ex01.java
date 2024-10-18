package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        
        switch (trans) {
            case BUS:
                System.out.println("버스 탑승");
                break;
            case SUBWAY:
                System.out.println("지하철 탑승");
                break;
            case TAXI:
                System.out.println("택시 탑승");

        }


    }
}
