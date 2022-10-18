import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {

        // Given an array of integers heights representing the histogram's bar height
        // where the width of each bar is 1, return the area of the largest rectangle in the histogram.

        // heights = [2,1,5,6,2,3]
        // the maximum area is 10 that is of 5*2

        // For each index the maximum area possible is
        //  heightof Each bar * ( FirstSmallerLeftIndex - FirstSmallerRightIndex + 1 )

        // so we will create two arrays to store firstSmallerLeftIndex and FristSamller right Index
        // using stack and then calculate and check area for each elements area

        int[] arr = {2,1,5,6,2,3};
        int n = arr.length;
        // left array to store index of first smaller element to left side of an element
        int[] left = new int[n];

        // similarly right array
        int[] right = new int[n];

        Stack<Integer> stack =new Stack<>();

        for(int i = 0; i < n; i++){

            while( !stack.isEmpty() && arr[stack.peek()] >= arr[i] ){ stack.pop(); }

            // here if there is no smaller element to the left than only
            // the floor before the starting index will be smaller hence set it as -1
            if( stack.isEmpty() ) left[i] = -1;
            else{
                left[i] = stack.peek();
            }

            stack.push(i);
        }

        // empty the stack for calculating first smaller index to the right

        while( !stack.isEmpty() ){stack.pop();}

        for(int i = n-1; i >= 0; i--){

            while( !stack.isEmpty() && arr[stack.peek()] >= arr[i] ){ stack.pop(); }

            // here if there is no smaller element to the right than only
            // the floor after the ending index will be smaller hence set it as n
            if( stack.isEmpty() ) right[i] = n;
            else{
                right[i] = stack.peek();
            }

            stack.push(i);
        }

        // now calculating area
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < n ; i++){

            if( maxArea < ( arr[i]*( right[i]-left[i]+1 ) )){
                maxArea = arr[i]*( right[i]-left[i]+1 );
            }
        }
        System.out.println(maxArea);
    }
}
