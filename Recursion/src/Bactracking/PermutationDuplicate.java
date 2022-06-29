package Bactracking;

import java.util.ArrayList;

public class PermutationDuplicate {

    public static void main(String[] args) {

       int[] arr = {1,1,2};
       boolean[] visited = new boolean[arr.length];
       ArrayList<Integer> ans = new ArrayList<>();
       permu(arr,visited,ans);
    }

    public static void permu(int[] arr,boolean[] visited,ArrayList<Integer> ans){

        if( ans.size() == arr.length){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(visited[i]){ continue; }
            if(i > 0 && arr[i-1] == arr[i] && !visited[i-1]){ continue; }
            ans.add(arr[i]);
            visited[i] = true;
            permu(arr,visited,ans);
            visited[i] = false;
            ans.remove(ans.size()-1);
        }
    }
}
