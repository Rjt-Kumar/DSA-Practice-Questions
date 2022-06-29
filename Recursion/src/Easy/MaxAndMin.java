package Easy;

import java.util.ArrayList;

public class MaxAndMin {

    public static void main(String[] args) {

        int[] arr = {5,3,2,1};

        int a = max(arr,0);
        System.out.println(a);
    }

    public static int max(int[] arr,int index){

      if( index == arr.length-1){
          return arr[index];
      }

      return Integer.max(arr[index],max(arr,index+1));



    }


}
