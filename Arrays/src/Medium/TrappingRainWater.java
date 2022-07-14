package Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
         // [0,1,0,2,1,0,1,3,2,1,2,1]
         //  Output: 6
         // The amount of water trap at a place is equal to Min(rightMaxTower,LeftMaxTower) - arr[i]

         int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

         // Here we will create two arrays
         int[] rightMax = new int[arr.length];

        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i >= 0; i-- ){

            max = Math.max(max,arr[i]);
            rightMax[i] = max;

        }

        int[] leftMax = new int[arr.length];
        max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++){

            max = Math.max(max,arr[i]);
            leftMax[i] = max;

        }

        // The amount of water trapped for an index is equal to smallest(rightMax,leftMax) - arr[i]

        int totolWater = 0;

        for(int i = 0; i < arr.length;i++){

            totolWater+= (Math.min(rightMax[i],leftMax[i])) - arr[i];
        }

        System.out.println(totolWater);
    }
}
