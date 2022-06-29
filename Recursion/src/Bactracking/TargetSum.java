package Bactracking;

public class TargetSum {
    static int count;
    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1};
        int target = 3;


        System.out.println(findTargetSumWays(nums,2));
    }

    public static int findTargetSumWays(int[] nums, int target) {


        if( nums.length == 1){
            if( nums[0] < target ){
                return 0;
            }else{
                return 1;
            }
        }

        sum(nums,0,target,0);
        System.out.println(count);
        return count;

    }

    public static void sum(int[] arr,int currIndex,int target,int sum){

        if( currIndex == arr.length ){

            if( sum == target ){
                count++;
            }

            return;
        }

        sum(arr,currIndex+1,target,sum+arr[currIndex]);
        sum(arr,currIndex+1,target,sum-arr[currIndex]);
    }

}
