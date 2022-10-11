package stack;

import java.util.Stack;

public class reverseAStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        reverse(stack);
    }

    public static void reverse(Stack<Integer> stack ){

        if( stack.isEmpty() ){
            return;
        }

        int currVal = stack.pop();
        reverse(stack);
        bottom(stack,currVal);

    }

    public static void bottom(Stack<Integer> stack , int value){

        if( stack.isEmpty() ){
            stack.push(value);
            return;
        }

        int currVal = stack.pop();

        bottom(stack,value);
        stack.push(currVal);
    }

}
