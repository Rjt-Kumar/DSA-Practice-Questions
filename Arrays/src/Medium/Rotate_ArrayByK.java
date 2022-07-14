package Medium;

import java.util.*;
public class Rotate_ArrayByK {

    public static void main(String[] args) {
        int[] arr = {3,4,5,4,3,2,2};

        int k = 5;

        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr,int k ){

        k = k % arr.length;

        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        return;
    }

    public static void reverse(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
