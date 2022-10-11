package stack;
import java.util.*;

public class reversAstring {

    public static void main(String[] args) {
        char[] ch = {'b','c','d'};

        Stack<Character> stack = new Stack<>();
        for(char c : ch){

            stack.push(c);
        }

        int i = 0;
        while( !stack.isEmpty() ){
            ch[i++] = stack.pop();
        }

        System.out.println(Arrays.toString(ch));
    }
}
