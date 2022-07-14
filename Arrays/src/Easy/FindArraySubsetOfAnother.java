package Easy;

import java.util.HashSet;

public class FindArraySubsetOfAnother {

    public static void main(String[] args) {

        // here we will be using hashing i.e. hashSet
        // Remember there are no duplicate elements in array
        // We will put the first array in the hashSet
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,4,5};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length;i++){

            set.add(arr1[i]);

        }
        // Iterate through next array one by one and check if that element is present in the hashSet
        for(int i = 0; i < arr2.length; i++){

            if(set.contains(arr2[i])){
                continue;
            }
            System.out.println("Not an subs");
        }



    }
}
