package stack;

public class CustomStack {

    protected int[] data ;
    private final static int default_size = 100;
    int ptr = -1;

    public CustomStack(){
        this(default_size);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public void push(int value){

        if( isFull() ){
            System.out.println("Sttack is full");
            return;
        }

        data[++ptr]= value;

    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty cannot pop");
        }

        int val = data[ptr];
        data[ptr--] = 0;
        return val;
    }

}
