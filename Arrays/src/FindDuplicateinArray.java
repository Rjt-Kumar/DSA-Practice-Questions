;

public class FindDuplicateinArray {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        // First we will sort this array using cyclic sort

        int i = 0;
        while( i < arr.length){
            int currentIndex = arr[i] - 1;

            if( arr[i] != arr[currentIndex]){
                swap(arr,i,currentIndex);
            }
            i++;
        }

        System.out.println(arr[arr.length-1]);
    }

    public static void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
