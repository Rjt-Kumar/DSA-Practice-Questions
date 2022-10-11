package stack;

import java.util.Stack;

public class SortAStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        sort(stack);
    }

    public static void sort(Stack<Integer> stack ){
        if( stack.isEmpty() ){
            return;
        }

        int currVal = stack.pop();
        sort(stack);
        insertCorrect(stack,currVal);
    }

    public static void insertCorrect(Stack<Integer> stack, int val){

        if( stack.isEmpty()){
            stack.push(val);
            return;
        }

         int  currVal = stack.pop();

        if( currVal > val){
            stack.push(currVal);
            stack.push(val);
            return;
        }

        insertCorrect(stack,val);
        stack.push(val);
    }
}
