public class CountInversions {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        // here we have to count the no. of inversion of the wrongly placed elements
        // here the output is 3 cause (2,1) (4,1) (4,3) are wrongly placed

        // here we will apply merge sort

        int count = mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }
    public static int mergeSort(int[] arr,int low,int high){
        int middle , inv = 0;

        if( low < high){
            middle = (low+high)/2;

            inv += mergeSort(arr,low,middle);
            inv += mergeSort(arr,middle+1,high);

            inv += merge(arr,low,middle,high);
        }
        return inv;

    }

    public static int merge(int[] arr,int low,int middle,int high){
        int i = low;
        int j = middle+1;
        int k = low;
        int inv = 0;
        int[] temp = new int[arr.length];

        while( i <= middle && j <= high){

            if( arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
                inv += (middle - i) + 1;
            }
        }

        // Now copying any left array in the temp array
       while( i <= middle){
           temp[k++] = arr[i++];
       }
       while( j <= high){
           temp[k++] = arr[j++];
       }

       // copying this temp array in the original array
        for(int n = low; n <= high; n++){
            arr[n] = temp[n];
        }

        return inv;
    }
}
