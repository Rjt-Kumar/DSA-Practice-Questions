import java.util.ArrayList;

public class CommonElements {

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

        // Here we will create three variable and pass it in while loop each pointing to first element in each array

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j =0,k=0;

        while( i < a.length && j < b.length&& k < c.length){

            if(a[i] == b[j] && b[j] == c[k] && !list.contains(a[i])){
                list.add(a[i]);
                i++;
                j++;
                k++;
            }else if(a[i] < b[j]){ i++; }
            else if(b[j] < c[k]){ j++; }
            else {
                k++;
            }
        }

        System.out.println(list);
    }
}
