package Easy;

import java.util.Arrays;

public class RecursiveInsertion {

    public static void main(String[] args) {

        int[] arr = {4,3,5,6,8,69,4,2,3,5};
        again(arr,1,1);
    }

    public static void insertion(int[] arr, int col, int row){

        if( row == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        if( col > 0 ){

            if( arr[col] < arr[col-1]){
                swap(arr,col,col-1);
            }

            insertion(arr,col-1,row);
        }else{

            insertion(arr,row+1,row+1);
        }
    }

    public static void swap(int[] arr, int first , int second){

        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;


    }

    public static void again(int[] arr,int col, int row){

        if( row == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        if( col > 0 ){

            if( arr[col] < arr[col-1]){
                swap(arr,col,col-1);
            }
            again(arr,col-1,row);

        }else{
            again(arr,row+1,row+1);
        }





    }
}
