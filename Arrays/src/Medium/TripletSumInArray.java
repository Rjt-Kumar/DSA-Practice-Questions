package Medium;

public class TripletSumInArray {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int sum = 0;
        // Only works on sorted array
        // Here what we will do is take three pointers
        // first at i = 0; j = i+1; k = arr.length
        // then if two inner loops will be there
        // we will check for every element in arr.length
        int i = 0;
        int k = arr.length-1;
        int j = i+1;

        while( i < arr.length){

            j = i+1;
            k = arr.length-1;
            while( j < k && k > i ){

                if( arr[i]+arr[j]+arr[k] == sum){

                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;

                }else if( arr[i]+arr[j]+arr[k] < sum){

                    j++;

                }else{
                    k--;
                }

            }
            i++;


        }
    }


}

