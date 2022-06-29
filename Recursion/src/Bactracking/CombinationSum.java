package Bactracking;

import java.util.ArrayList;

public class CombinationSum {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {2,3,7};
        ArrayList<Integer> ans = new ArrayList<>();
        combo(arr,7,0,ans);

        System.out.println(list);
    }

    public static void combo(int[] arr, int target, int index ,ArrayList<Integer> ans){

        if( target == 0){
            list.add(new ArrayList<Integer>(ans));
            return;
        }

        for( int i = index; i < arr.length && arr[i] <= target; i++){

            ans.add(arr[i]);
            combo(arr,target-arr[i],i,ans);
            ans.remove(new Integer(arr[i]));

        }



    }
}
