package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeTheArrayAsPosNeg {

    public static void main(String[] args) {

        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }

        int p =0;
        int n =0;
        for(int i =0; i < arr.length;){
            if(p < pos.size()){arr[i] = pos.get(p);
            i++;  p++;
            }

            if(n < neg.size()){arr[i] = neg.get(n);
            i++;
            n++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
