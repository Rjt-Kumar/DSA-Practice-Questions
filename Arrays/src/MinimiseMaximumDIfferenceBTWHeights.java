public class MinimiseMaximumDIfferenceBTWHeights {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 4;

        int tempMin = arr[0];
        int tempMax = arr[arr.length-1];
        int ans = tempMax - tempMin;

        for(int i = 1; i < arr.length; i++){
            if( arr[i] - k < 0){ continue; }

            tempMin = Math.min(arr[0] + k,arr[i] - k);
            tempMax = Math.max(arr[arr.length-1] - k,arr[i-1]+k);
            ans = Math.min(ans,tempMax-tempMin);
        }

        System.out.println(ans);
    }

}
