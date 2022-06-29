package Easy;

public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println(prime(2,2));
    }

    public static boolean prime(int n , int i ){

        if( (i*i) > n){
            return true;
        }

        return (n%i != 0) && prime(n,i+1);
    }
}
