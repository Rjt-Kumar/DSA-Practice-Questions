package Easy;

import static java.lang.Character.isUpperCase;

public class First_Uppercase_Letter_in_a_String {

    public static void main(String[] args){

        char sa = firstUpper("abcdefghijklM");
        System.out.println(sa);
    }
    public static char firstUpper(String old){

        if( old.isEmpty() ){
            return '0';
        }

        char ch = old.charAt(0);


        if(isUpperCase(ch)){
            return ch;
        }else{
            return firstUpper(old.substring(1));
        }



    }
}
