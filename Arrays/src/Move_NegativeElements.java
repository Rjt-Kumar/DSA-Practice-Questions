import java.util.Arrays;

public class Move_NegativeElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,-2,4,-5,-1};

        int[] ans = new int[arr.length];
        int start = 0;
        for(int i = 0; i < arr.length;i++ ){
            if(arr[i] >= 0){
                ans[start] = arr[i];
                start++;
            }
        }
        int end = start;
        for(int i = 0; i < arr.length;i++){
            if( arr[i] < 0){
                ans[start] = arr[i];
                start++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
