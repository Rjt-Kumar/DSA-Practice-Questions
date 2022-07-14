package Easy;

public class KthSmallest_LargesElement {

    public static void main(String[] args) {
        int[] arr = {3,2,5,6,7,8,12,13,45};
        int k = 3;
        // There are many ways to find the kth smallest and largest element
        // First way is to sort the array and return (k-1) for smallest and (arr.length-k) for largest

        // Other method is by counting the number of elements smaller or larger
        // than the element at the current index.If the (no == k-1) then return else check for next element.
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
            count = 0;
            for(int j = 0 ;j < arr.length ; j++){
                if( arr[i] > arr[j]){
                    count++;
                }
            }

            if( count == k-1 ){
                System.out.println("The Kth smallest element is " + arr[i]);
            }
            // for finding Kth largest element just increase count for larger elements
        }
    }
}
