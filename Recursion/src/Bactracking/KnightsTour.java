package Bactracking;

public class KnightsTour {

    public static void main(String[] args){
        int[][] board = new int[5][5];



        knight(board,0,0,1);

        }

        public static void knight(int[][] board,int row,int col,int n){

          if(row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] > 0){
              return;
          }else if( n == board.length*board.length ){
              board[row][col] = n;
                for(int[] arr: board){
                    for(int elm: arr){
                        System.out.print(elm + " ");
                    }
                    System.out.println();
                }
              System.out.println();
               board[row][col] = 0;
                return;
            }



          board[row][col] = n;


          //Up right
           knight(board,row-2,col+1,n+1);

          // Up left
          knight(board,row-2,col-1,n+1);

          // Left Up
         knight(board,row-1,col+2,n+1);

          // Left down
         knight(board,row+1,col+2,n+1);

          //Down right
          knight(board,row+2,col+1,n+1);

          //Down left
         knight(board,row+2,col-1,n+1);

          //Left up
          knight(board,row-1,col-2,n+1);

          //Left down
          knight(board,row+1,col-2,n+1);

          board[row][col] = 0;
        }


//    public static void main(String[] args) {
//
//
//        int arr[][] = new int[5][5];
//
//        printKnightsTour(arr, 0, 0, 1);
//    }
//
//    public static void printKnightsTour(int[][] chess, int row, int col, int move) {
//
//        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
//            return;
//
//        } else if (move == chess.length * chess.length) {
//            chess[row][col] = move;
//            displayBoard(chess);
//            chess[row][col] = 0;
//            return;
//        }
//
//        chess[row][col] = move;
//        printKnightsTour(chess, row - 2, col + 1, move + 1);
//        printKnightsTour(chess, row - 1, col + 2, move + 1);
//        printKnightsTour(chess, row + 1, col + 2, move + 1);
//        printKnightsTour(chess, row + 2, col + 1, move + 1);
//        printKnightsTour(chess, row + 2, col - 1, move + 1);
//        printKnightsTour(chess, row + 1, col - 2, move + 1);
//        printKnightsTour(chess, row - 1, col - 2, move + 1);
//        printKnightsTour(chess, row - 2, col - 1, move + 1);
//        chess[row][col] = 0;
//    }
//
//    public static void displayBoard(int[][] chess) {
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[0].length; j++) {
//                System.out.print(chess[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//    }

    }

