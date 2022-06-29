package Easy;

public class SumOfDigits {

    public static void main(String[] args) {

        sum(12345,0);

    }

    public static void sum(int n , int sum){
        if( n <= 0){
            System.out.println(sum);
            return;
        }
        // current digit

        int rem = n % 10;

        sum(n/10,sum+rem);

    }
}
