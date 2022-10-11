package stack;

public class twoStacksInOneArray {

    int top1;
    int size;
    int top2;
    private int[] data;

    public twoStacksInOneArray(){
        this(100);
    }

    public twoStacksInOneArray(int s){
        this.size = s;
        this.data = new int[size];
    }

    public void push1(int val){

        if( top1 > top2 ){
            System.out.println("Stack is full ");
            return;
        }

        data[top1++] = val;

    }

    public void push2( int val){

        if( top1 > top2 ){
            System.out.println("Both Stacks are full");
            return;
        }

        data[top2--] = val;

    }

    public int pop1(){

        if( top1 == 0 ){
            System.out.println("Stack1 is empty");
            return -1;
        }

        int val = data[top1];
        data[top1--] = 0;
        return val;

    }

    public int pop2(){

        if( top2 == size ){
            System.out.println("Stack1 is empty");
            return -1;
        }

        int val = data[top2];
        data[top2++] = 0;
        return val;

    }
}
