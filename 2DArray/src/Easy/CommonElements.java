package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {

    // The question is to find common elements in each row of the matrix

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 1, 4, 8},
                       {3, 7, 8, 5, 1},
                       {8, 7, 7, 3, 1},
                       {8, 1, 2, 7, 9},
                      };

        ArrayList<Integer> list = new ArrayList<>();
        // first approach is to sort each row and then just find common elements just like
        // in previous question ( finding common element in sorted arrays)

        for(int row = 0 ;row < arr.length; row++){

            int[] temp = new int[arr[0].length];

            for(int col = 0; col < arr[0].length; col++ ){
                temp[col] = arr[row][col];
            }

            Arrays.sort(temp);

            for(int col = 0; col < arr[0].length; col++ ){
                  arr[row][col] = temp[col];
            }
        }

        for(int row = 0; row < arr.length; row++){

            for( int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // now each row of the matrix is sorted
        // now brute force is to search for each element of the first row in other row

        for(int col = 0; col < arr[0].length; col++){

            int target = arr[0][col];
            int row = 1;
            for(; row < arr.length; ){

                if( !search(arr,row,target) ){
                    break;
                }else{
                    row++;
                }
            }
            if( row == arr.length){
                list.add(target);
            }

        }

        System.out.println(list);
    }

    public static boolean search(int[][] arr, int row , int target ){

        int start = 0;
        int end = arr[0].length-1;

        while( start <= end){

            int middle = (start+end)/2;

            if( arr[row][middle] == target ){
                return true;
            }else if( arr[row][middle] < target){
                start = middle + 1;
            }else{
                end = middle -1;
            }
        }
        return false;

    }
}
