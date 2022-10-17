import java.util.*;
public class infixToPostFix {

    public static void main(String[] args) {

        String infix = "x+y*z-c/d-v*h";

        // here i have created a hashmap to store each character's precedence
        HashMap<Character,Integer> map = new HashMap<>();
        // to create a string to store postfix expression
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);

        /* Logic

        Traverse from left to right in the string, if the current character is an operand
        then append it in the new answer string , if it is an operator then
        push it into the stack according to its precedence.

        There should not be any operators in the stack that have a greater or equal preference
        than that operator , if there are operators that have greater or equal Prec.. then
        append all in the answer string, until we found correct operator or stack becomes empty

         */




        for(int i = 0; i < infix.length(); i++){

            char ch = infix.charAt(i);

            if( ch !='+' && ch != '-' && ch != '*' && ch != '/' ){
                builder.append(ch);
            }else{

                    while( !stack.isEmpty() && map.get(stack.peek()) >= map.get(ch)){
                        builder.append(stack.pop());
                    }
                    stack.push(ch);

            }
        }
        while( !stack.isEmpty()){
            builder.append(stack.pop());
        }
        System.out.println(builder.toString());
    }
}
