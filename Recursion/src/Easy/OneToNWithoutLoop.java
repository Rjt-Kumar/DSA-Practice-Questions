package Easy;

public class OneToNWithoutLoop {

    public static void main(String[] args) {
        print1(5);
    }

    public static void print1(int n){

        if( n == 1){
            System.out.println(n);
            return;
        }

        print1(n-1);
        System.out.println(n);



    }
}
