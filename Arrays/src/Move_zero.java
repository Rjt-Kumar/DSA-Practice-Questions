public class Move_zero {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,3,4,50,0};

        int snowBall = 0;

        for(int i = 0 ;i < arr.length; i++){

            if( arr[i] == 0){snowBall++;}
        }
    }
}
