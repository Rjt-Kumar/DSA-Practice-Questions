import java.util.Arrays;

public class SortingArrayOf_Zeros_Ones{

    public static void main(String[] args) {

     int[] arr = {2,2,2,1,1,1,0};

     int zero = 0;
     int ones = 0;
     int twos = 0;

     for(int i = 0; i < arr.length ; i++){

         if(arr[i] == 0){zero++;}
         else if(arr[i] == 1){ ones++; }
         else{ twos++; }

     }

     // Now changing the original array

        for(int i = 0; i < arr.length; i++){

            if( i < zero){arr[i] = 0;}
            else if( i < (zero+ones) ){ arr[i] = 1;}
            else{
                arr[i] = 2;
            }
        }

        System.out.println(Arrays.toString(arr));

        }



}
