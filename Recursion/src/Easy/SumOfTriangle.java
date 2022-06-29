package Easy;

import java.util.Arrays;

public class SumOfTriangle {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum(arr);
    }

    public static void sum(int[] arr){
        if( arr.length == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] add = new int[arr.length-1];
        for(int i = 0; i < arr.length-1; i++){
            add[i] = arr[i] + arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        sum(add);
//        System.out.println(Arrays.toString(arr));
    }
}
