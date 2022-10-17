import java.util.*;

public class NGE_Right {

    public static void main(String[] args) {
        int[] arr = {4,3,5,2};
        // now we need to find the next greater element to the right of the array
        // if not present put -1
        int[] nge = new int[arr.length];

        // here we will be using a stack and starting from the end of the array we will
        // se if there is any element in the stack greater than current element
        // if stack is empty ---> no greater element is present -- then update nge array with -1
        // pop elements from stack that are smaller than curr element as currElemntit will become nge for upcoming
        // elements  ---> imagine pillars casting shadows on right side  we ignore small pillars
        //                as they are getting under the shadow of large pillars
        // if there is any element greater than currelement then update nge array with that element
        // add curr element in the stack --> as it could be nge for next element
        Stack<Integer> stack = new Stack<>();

        // now there is another variant of this question  in we have to find the greater element to
        // when the array is circular

           // Non circular array
//        for(int i = arr.length-1; i >= 0; i--){
//
//              while( !stack.isEmpty() && stack.peek() <= arr[i]){ stack.pop(); }
//
//              if(stack.isEmpty()){ nge[i] = -1;}
//              else{
//                  nge[i] = stack.peek();
//              }
//
//              stack.push(arr[i]);
//        }


        // Circular array
        //  int[] arr = {4,3,5,2};
        // we will create  copy the same array behind it  4 3 5 2 4 3 5 2
        // now we will start from the end of the array
        // and find the next greater element from 2*n-1
        // but we will update nge array only for i < n
        // and since this duplicate array is in our mind only hence index of each element
        // will be i % n
        int n = arr.length;
        for(int i = 2*n-1; i>= 0; i--){

            while( !stack.isEmpty() && stack.peek() <= arr[i%n]){ stack.pop(); }
            // only update the nge array for i < n
            // it is like we are getting the first greater element from the whole array

            if( i < n ){
                if(stack.isEmpty()){ nge[i] = -1;}
                else{
                    nge[i] = stack.peek();
                }
            }
            stack.push(arr[i%n]);

        }

        System.out.println(Arrays.toString(nge));

    }


}
