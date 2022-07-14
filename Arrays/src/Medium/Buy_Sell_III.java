package Medium;

public class Buy_Sell_III {

    public static void main(String[] args) {
        int[] arr = {7,2,4,5,2,4,6,6,9};

        int buy1= Integer.MAX_VALUE , buy2 = Integer.MAX_VALUE;
        int sell1 = 0,sell2 = 0;

        for(int i = 0; i < arr.length;i++){

            // This is similar to finding the buy stock I
            buy1 = Math.min(buy1,arr[i]);
            sell1 = Math.max(sell1,arr[i]-buy1);

            buy2 = Math.min(buy2,arr[i]-sell1);
            sell2 = Math.max(sell2,arr[i]-buy2);

        }

        System.out.println(sell2);

    }
}
