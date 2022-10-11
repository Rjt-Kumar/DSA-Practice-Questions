package stack;
import java.util.*;
public class DeleteMiddle {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        // if stack is odd then the middle is (size+1)/2;
        // but if the stack is even {1,2,3,4}
        // then 2 is middle . Hence we have to pop elements till 2
        int middle = (5+1)/2;
        removeMiddle(stack,middle);

    }

    public static void removeMiddle(Stack<Integer> stack , int middle){
        if( middle == 1){
            stack.pop();
            return;
        }

        int val = stack .pop();
        removeMiddle(stack,middle-1);
        stack.push(val);
    }
}
