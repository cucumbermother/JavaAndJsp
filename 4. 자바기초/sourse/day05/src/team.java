public class team {
    public static void main(String[] args) {
        int sum = 0;
        int [] nums = {15, 99 , 256 , 58 , 77 , 88 , 946 , 874, 586 , 782};
        for( int i = 0 ;  i  < 10; i++ ){
            if( nums[i] % 2 == 0){
                sum++;
            }
        }
        System.out.printf("짝수갯수 : %d" , sum); // 짝수갯수 : 7

    }
}
