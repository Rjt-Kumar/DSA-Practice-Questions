package stack;

import java.util.Stack;

public class PutElementInBottom {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);


        bottom(stack,7);

    }

    public static void bottom(Stack<Integer> stack, int value){

        if ( stack.isEmpty() ){
            stack.push(value);
            return;
        }

        int currVal = stack.pop();
        bottom(stack,value);
        stack.push(currVal);

    }
}
