import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

         int[] arr1 = {1,3,5,7,8};
         int[] arr2 = {2,4,6,9,10};

         merge(arr1,arr2);
        System.out.print(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void merge(int[] arr,int[] nums){

        // here we will create two variables i and j
        // where j will iterate over every element in  second array for starting index
        // whereas i will iterate from last index in array one and check which is smaller

        int i = arr.length-1;
        int j = 0;

        while ( i >=0 && j < nums.length){

            if( arr[i] >= nums[j]){
                int temp = arr[i];
                arr[i] = nums[j];
                nums[j] = temp;
            }else{
                break;
            }
            i--;
            j++;
        }

       Arrays.sort(arr);
        Arrays.sort(nums);
    }
}
