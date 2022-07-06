import java.util.HashMap;

public class FindAllPairsOfIntegerWhoseSum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};

        int sum = 2;

        // First we will create a hasMap to store array element and its frequencies in it

        HashMap<Integer,Integer> map = new HashMap<>();

        // Now we will put every element in the hasmap as key and its freq as its value

        for(int i = 0; i < arr.length; i++){

            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }

            map.put(arr[i],map.get(arr[i])+1);
        }

        // Now we will create a variable named twicecount as it is counted twice
        int twiceCount = 0;

        for(int i = 0; i < arr.length;i++){

            if(map.containsKey(sum - arr[i])){
                twiceCount+= map.get(sum-arr[i]);
            }

            if( sum-arr[i] == arr[i]){
                twiceCount--;
            }
        }

        System.out.println(twiceCount/2);
    }
}
