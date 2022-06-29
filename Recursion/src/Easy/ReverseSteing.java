package Easy;

import java.util.*;

public class ReverseSteing {

    public static void main(String[] args) {
        char[] arr = {'a','v','c'};

        reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(char[] arr,int i ){

        if( i == arr.length/2){return;}

        char temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;

        reverse(arr,i+1);

    }
}
