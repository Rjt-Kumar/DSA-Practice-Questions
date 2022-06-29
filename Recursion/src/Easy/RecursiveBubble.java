package Easy;

import java.util.Arrays;

public class RecursiveBubble {

    public static void main(String[] args) {

        int[] arr = {3,45,2,5,3,2,1};
        bubble(arr,0,arr.length-1);
    }

    public static void bubble(int[] arr,int col, int row){

      if( row == 0){
          System.out.println(Arrays.toString(arr));
          return;
      }

      if( col < row){

          if( arr[col] > arr[col+1]){
              swap(arr,col,col+1);
          }

          bubble(arr,col+1,row);

      }else{
          bubble(arr,0,row-1);
      }
    }

    public static void swap( int[] arr, int first , int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
