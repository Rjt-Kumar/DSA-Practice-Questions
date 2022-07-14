package Medium;

import java.util.HashMap;

public class SubarrayWithSumZero {

    public static void main(String[] args) {
        int[] arr = {4 ,2 ,-3 ,2 ,6};

        // Here we will create a hashmap to store the currentSum at each index in hashmap

        HashMap<Integer,Integer> map = new HashMap<>();

        int currentSum = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if(currentSum == sum){
                System.out.println("TRUE");
                return;
            }

            if( map.containsKey(currentSum-sum)){
                System.out.println("TRUE");
                return;
            }
            map.put(currentSum,i);
        }
        System.out.println("FALSE");

    }
}
