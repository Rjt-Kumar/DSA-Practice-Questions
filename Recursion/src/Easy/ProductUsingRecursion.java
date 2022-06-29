package Easy;

public class ProductUsingRecursion {

    public static void main(String[] args) {
        System.out.println(product(5,5));

    }

    public static int product(int n, int t){
        int sum = 0;
        if( t == 0){
            return sum;
        }

        sum = sum + n;

        sum = sum + product(n,t-1);

        return sum;

    }
}
