package Easy;

public class Fibbo {

    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }

    public static int fibo(int n){

        if( n == 0){
            return 0;
        }

        if( n == 1){
            return 1;
        }

        int a = fibo(n-1);
        int b = fibo(n-2); // calculate time complexity using homogeneous method for linear recurrense relations

        return a+b; // or directly return fibo(n-1)+fibo(n-2);
    }
}
