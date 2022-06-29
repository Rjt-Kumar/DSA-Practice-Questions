package Easy;

public class NoOfStepsToZero {

    public static void main(String[] args) {
        System.out.println(zero(55));

    }

    public static int zero(int n){

        if( n == 0){return 0;}

        if( n % 2 == 0){
            return 1+zero(n/2);
        }else{
            return 1+zero(n-1);
        }



    }
}
