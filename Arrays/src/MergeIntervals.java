import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = {{1,4},{3,6},{9,10},{12,23}};
        ArrayList<int[]> list = new ArrayList<>();

        // here we will first sort the 2D array

        Arrays.sort(arr,(o1,o2)-> o1[0]-o2[0]);

        // now we will take two variables start and end
        int start = arr[0][0];
        int end = arr[0][1];

        int i = 1;
        while( i < arr.length){

            int s = arr[i][0];
            int e = arr[i][1];

            if( s <= end){
                end = Math.max(end,e);
            }else{
                list.add(new int[]{start,end});
                start = s;
                end = e;
            }
            i++;
        }
        // here we have to again add start and end in list else the last one would not be added
        list.add(new int[]{start,end});
        for(int j = 0; j < list.size();j++){
            System.out.println(Arrays.toString(list.get(j)));
        }
    }
}
