package Easy;

public class SpecialFibbo {

    public static void main(String[] args) {

        int a = special(8,7,5);
        System.out.println(a);
    }

    public static int special(int n , int a , int b){

        if( n == 0)
        {
            return a;
        }
        if( n == 1){
            return b;
        }
        if( n == 2){
            return a^b;
        }

        return special(n-1,a,b)^special(n-2,a,b);



    }


}
