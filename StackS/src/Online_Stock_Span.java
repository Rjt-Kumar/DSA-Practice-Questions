import java.util.*;

public class Online_Stock_Span {

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,65,75};
        int[] ans = new int[arr.length];
        // answer array will be {1,1,1,2,1,4}

        // so we will use stack to store the index of element we are putting in the stack
        /*Try this problem after doing daily temperature
 suppose you are given an array
   arr = { 100 , 80 , 70 , 60 , 75 , 65 , 85 }
	 the answer array will be
	 ans = { 1 , 1 , 1 , 1 , 3 , 1 , 6 }

	 there is a pattern that we can identify that
	 for every number the stock span will be the sum of stock span of all number less than
	 it

	 like for 75 stock span = SS(60) + SS(70) + 1
	 and for 85 = SS(65) + SS(75) + SS(80) + 1
	 // now here is a catch we didn't take SS of elements that are already counted in some previous elements stocks span like 60 and 70 are already counted
	 this implies that these indices would be removed from stack

	 So we need to mantain an anwer array and a stack to store the last updated index
	 if there is no element having value less or equal to current then we update that index in
	 answer array as 1 and if we found an element smaller than current element in stack
	 then add its answer in the answer of current element pop it from stack.

	 */
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            while( !stack.isEmpty() && arr[stack.peek()] <= arr[i] ){
                count += ans[stack.pop()];
            }
            ans[i] = count;
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
