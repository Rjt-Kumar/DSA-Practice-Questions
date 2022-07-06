public class BestTimeToBuyAndSell {

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,40};

        int lsf = Integer.MAX_VALUE;
        int maxProfit = 0;

        // traverse through whole array and find the least value
        // while finding the least value also find the max Profit while by subtracting currentElement with lsf

        for(int i = 0; i < arr.length; i++){

            if( arr[i] < lsf){
                lsf = arr[i];
            }

            maxProfit = Math.max(maxProfit,arr[i] - lsf);
        }

        System.out.println(maxProfit);
    }
}

