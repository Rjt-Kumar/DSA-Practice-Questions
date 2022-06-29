package Easy;

public class SortedOrNot{

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,2};
        System.out.println(sorted(arr,0));
    }

    public static boolean sorted(int[] arr,int i){

        if( i == arr.length - 1){
            return true;}

        return (arr[i] < arr[i+1]) && sorted(arr,i+1);
    }
}
