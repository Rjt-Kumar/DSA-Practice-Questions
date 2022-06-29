package Easy;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int ans = binary(arr,0,arr.length-1,6);
        System.out.println(ans);
    }


    public static int binary(int[] arr,int start,int end , int target){

        if( start > end ){
            return -1;
        }

        int middle = start +  ( end -start)/2;

        if( arr[middle] == target){
            return middle;
        }

        else if( arr[middle] < target){
            return binary(arr,middle+1,end,target);
        }else{

            return binary(arr,start,middle-1,target);
        }


    }
}
