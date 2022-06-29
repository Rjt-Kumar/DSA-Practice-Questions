package Bactracking;

public class LetterCombinationOfPhoneNo {

    public static void main(String[] args){

        letter("25","");
    }

    public static void letter(String old,String ans){
        if(old.isEmpty()){
            System.out.println(ans);
            return;
        }

        int n = old.charAt(0)-'0';

        for(int i= (n-1)*3;i < n*3; i++){
            char ch = (char)('a' + i);
            letter(old.substring(1),ans+ch);
        }
    }
}
