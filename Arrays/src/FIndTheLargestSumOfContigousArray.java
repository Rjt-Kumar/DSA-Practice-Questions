public class FIndTheLargestSumOfContigousArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,-4,-5,6,-7,7};

        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ;i < arr.length; i++){
            currentSum += arr[i];

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
