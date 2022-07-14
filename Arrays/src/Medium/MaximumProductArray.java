package Medium;

import javax.swing.text.MaskFormatter;

public class MaximumProductArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,-2,-5,-6,9,4,2};

        // it is similar to kaden's algorithm
        // we have to maintain two variables currMin and currMax

        int Maxsf= arr[0];
        int Minsf = arr[0];

        int max = arr[0];

        for(int i = 1; i < arr.length;i++){

            if( arr[i] < 0){
                // we will swap because if we multiply min element by -ve it becomes greater while
                // if we multiply max element with -ve it becomes smaller than the min element

                int temp = Maxsf;
                Maxsf = Minsf;
                Minsf = temp;
            }
            // here we have taken arr[i] , Maxsf*arr[i] because either we can start from this point arr[i]
            // or we can continue the previous product;
            Maxsf = Math.max(arr[i],Maxsf*arr[i]);
            Minsf = Math.min(arr[i],Minsf*arr[i]);

            // global maximum
            if(Maxsf > max){
                max = Maxsf;
            }
        }
        System.out.println(max);
    }
}
