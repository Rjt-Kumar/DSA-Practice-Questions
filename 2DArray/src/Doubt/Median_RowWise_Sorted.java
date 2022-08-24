package Doubt;

public class Median_RowWise_Sorted {

    public static void main(String[] args) {

        // In this problem we need to find the median of a row wise sorted matrix

        int[][] arr = {{1,3,7},
                       {3,5,9},
                       {2,7,9} };

        // here the answer is 5 as   1 2 3 3 5 7 7 9 9  5 is the median element
        // i.e. there are 5 elements smaller than equal to 5


        // so in this question we will use binary search
        // first take minimum  and maximum element in whole matrix
        // and take it's middle
        // Now count no. of elements in the matrix that are less than equal to that middle
        // if count <= 4 (r*c)/2 then we start = middle + 1;
        // if count > 4  end = middle - 1;

        // why we didn't return if count == 4 or count == 5 because in this case if middle = 6
        // it will be true but since 6 is not present in the matrix hence we cannot return it therefore
        // more answers lie right side ( start = middle + 1 )


        // This question can be divided into two parts
        // first checking the middle element in matrix if it is at correct Index

        // and searching for upperBound using binary search

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int midPoint = ((arr.length)*arr[0].length)/2;

        while( min <= max){

            int middle = (min + max)/2;

            // Now count no. of elements that are smaller than or equal to middle
            int count = 0;
            for( int row = 0; row < arr.length; row++){

                count += lessEqual(arr,row,middle);

            }

            if( count <= midPoint ){
                min = middle + 1;
            }else{
                max = middle - 1;
            }

        }

        System.out.println("The median of this matrix is "+ min);
    }

    public static int lessEqual(int[][] arr, int row,int target){

        // here we will be finding the index of the first largest element greater then target
        // ciel of the target

        int start = 0;
        int end = arr[0].length-1;

        // if the last element is smaller than the target element hence all the elements will be smaller
        if( arr[row][end] <= target ){
            return arr[0].length;
        }
        while( start <= end){

            int middle = (start+end)/2;

            if( arr[row][middle] <= target ){
                //bigger element lies on the right side
                start = middle + 1;
            }else{
                end = middle-1;
            }

        }
        return start;
    }
}
