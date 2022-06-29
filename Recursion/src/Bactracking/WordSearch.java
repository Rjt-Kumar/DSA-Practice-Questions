package Bactracking;

public class WordSearch {

    public static void main(String[] args){

        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};


        String word = "ABFC";
        boolean[][] visited = new boolean[board.length][board[0].length];
        // first we will check for the starting element and iterate through each element

        for(int row = 0; row < board.length ; row++){
            for(int col = 0; col < board[0].length ; col++){
                if(solve(board,visited,row,col,word,0)){
                    System.out.println("TRUE");
                    return;
                }
            }
        }

        System.out.println("FALSE");

    }

    static boolean solve(char[][] board,boolean[][] visited,int row,int col , String word,int index){

        if( index == word.length() ){
            return true;
        }

        // This is the check when we check for the next word in the letter , then it may violate the length of board
        if( row > board.length || row < 0 || col > board[0].length ||col <0 ){
            return false;
        }

        // If the current word is already in the letter and is visited then we cannot visit it again
        if(visited[row][col]){
            return false;
        }

        if( board[row][col] == word.charAt(index)){

            visited[row][col] = true;

            boolean check = solve(board,visited,row-1,col,word,index+1) || solve(board,visited,row+1,col,word,index+1) ||
                            solve(board,visited,row,col-1,word,index+1) || solve(board,visited,row,col+1,word,index+1);

            visited[row][col] = false;
            if( check ){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }



    }
}
