package Bactracking;

public class GenetrateParenthesis {

    public static void main(String[] args){

        para(3,0,0,"");
    }

    public static void para(int n, int open,int close,String ans){

        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }

        if(open < n){
            para(n,open+1,close,ans+"(");
        }
        if(close < open){
            para(n,open,close+1,ans+")");
        }

    }
}
