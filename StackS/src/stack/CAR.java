package stack;

public class CAR {

    int l ;
    int b  ;
    int h ;

    public CAR(){
        this.l = 1;
        this.b = 1;
        this.h = 1;
    }

    public CAR(int length, int height , int breadth ){

        this.b = breadth;
        this.h = height;
    }

    public static void main(String[] args) {


    }
}
 class honda extends CAR{
    int diagonal;

    public honda(){
        l = 5;
        this.b = 54;
    }


}