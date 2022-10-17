import java.util.*;
public class NGE_Left {

    public static void main(String[] args) {

        int[] arr = {1,6,4,2};

        // here we need to find the first greater element on the left side of that current element
        // here ans = {-1,-1,-1,4}

        // same as the next greater element on right
        // start checking and storing from start of the array
        Stack<Integer> stack = new Stack<>();
//        for(int i = 0; i < arr.length;i++){
//            int curr = arr[i];
//            while( !stack.isEmpty() && stack.peek() <= curr ){
//                stack.pop();
//            }
//            if( stack.isEmpty() ){ arr[i] = -1; }
//            else{ arr[i] = stack.peek(); }
//            stack.push(curr);
//        }
//
//        System.out.println(Arrays.toString(arr));

        // if we need to perform this on circular array

        // just like nge left for circular array
        // we have to perform for duplicate array and update only for i >= n
        // as we are checking for the left greater element
        int n= arr.length;
        for(int i = 0; i < 2*n;i++){
            int curr = arr[i%n];
            while( !stack.isEmpty() && stack.peek() <= curr ){
                stack.pop();
            }
            if( i >= n ){
            if( stack.isEmpty() ){ arr[i%n] = -1; }
            else{ arr[i%n] = stack.peek(); } }
            stack.push(curr);
        }

        System.out.println(Arrays.toString(arr));

    }
}
