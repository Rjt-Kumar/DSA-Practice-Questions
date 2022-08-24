package Easy;

public class WaveForm {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {4,5,6,48},
                       {7,8,9,78}};

        // print in format 1 4 7 8 5 2 3 6 9
        int col = 0;
        int row = 0;
        while ( col < 4){

           for(row = 0 ; row < 3; row++){
               System.out.print(arr[row][col]+" ");
           }
           col++;
           if( col < arr[0].length){
           for(row = 2; row >= 0; row--){
               System.out.print(arr[row][col]+" ");
           }
           col++;}
       }
    }
}
