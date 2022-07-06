import java.util.*;
public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {3,2,1};

        // firstly we will look for a breakpoint from the end of the array such that arr[i] < arr[i+1]

        int i = arr.length-2;

        while( i >=0 && arr[i] > arr[i+1]){ i--; }

        // Now we will check for the first element from the end of the array that is greater than the elment at
        // breakpoint
        int j = arr.length-1;
        if( i >= 0){
            while( j>=0 && arr[j] <= arr[i] ){
                j--;
            }
            if(j<0){ return; }
            swap(arr,i,j);
        }
        // after doing swap reverse the array from i+1 to end to get the corect lexiographical order
        reverse(arr,i+1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    public static void reverse(int[] arr,int start,int end){
        while( start<= end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}