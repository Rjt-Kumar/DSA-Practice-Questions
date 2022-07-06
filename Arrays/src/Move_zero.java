import java.util.*;

public class Move_zero {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,3,4,50,0};

        int snowBall = 0;

        for(int i = 0 ;i < arr.length; i++) {

            if (arr[i] == 0) {
                snowBall++;
            } else if (snowBall > 0) {
                swap(arr, i, i - snowBall);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
