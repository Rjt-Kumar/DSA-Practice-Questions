package Easy;

import java.util.Arrays;

import static Easy.RecursiveInsertion.swap;

public class RecursiveSelection {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,3,2,1};
        selection(arr,0,arr.length,0);

    }

    public static void selection(int[] arr, int col , int row , int max){

        if( row == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }

        if( col < row){

            if( arr[col] > arr[max]){
                max = col;
            }

            selection(arr,col+1,row,max);

        }else{

            swap(arr,row-1,max);
            selection(arr,0,row-1,0);

        }



    }
}
