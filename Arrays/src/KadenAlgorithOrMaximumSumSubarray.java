public class KadenAlgorithOrMaximumSumSubarray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-6,5,3,2,};

        // in kaden's algorithm we will take current sum and make a check with max sum
        // if the currentSum is < 0 then sum == 0 else simply move on

        int currentSum = 0;
        int max = 0;

        for(int i = 0 ; i < arr.length; i++){
            currentSum+= arr[i];

            if( currentSum > max){
                max = currentSum;
            }

            if( currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println(max);
    }
}
