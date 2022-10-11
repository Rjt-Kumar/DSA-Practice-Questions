package stack;
import java.util.*;

public class redundantBrackets {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String s = "((a+b))";

        for(int i = 0; i < s.length();i++ ){

            char ch = s.charAt(i);

            // if it is an open bracket or an operator then push it into the stack
            if( ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                stack.push(ch);
            }else{

                // ignore alphabets
                if( ch == ')' ){
                    // then check if under it contains any operator
                    if( stack.peek() == '+'||  stack.peek() == '-'||stack.peek() == '*'||stack.peek() == '/'){
                        while( stack.pop() != '('){ continue; }
                    }else{
                        System.out.println("Redundant brackets are present");
                        return;
                    }

                }
            }
        }

        System.out.println("Redundant brackets not present");
    }
}
