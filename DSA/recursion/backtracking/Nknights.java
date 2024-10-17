import java.util.*;
public class Nknights {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();


    boolean[][] board = new boolean[n][n];

    for(int i =0 ; i< board.length; i++){
      for(int j =0 ; j<board[i].length;j++){
        board[i][j] = true;
      }

    }
    System.out.println(dfs(0,board,new ArrayList<>()));

  }

   public static List<List<String>> dfs(int row, boolean[][] board, List<List<String>> ls){

    if(row == board.length){
      ls.add(display(board));
      return ls;
    }

    for(int col = 0 ; col < board[row].length; col++){
      if(isSafe(row,board,col)){
        board[row][col]= false;
        dfs(row+1, board, ls);
        board[row][col] = true;
      }
    }
    return ls;

   }

   public static boolean isSafe(int row, boolean[][] board, int col){
      int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
      int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};


        for (int i = 0; i < 8; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board.length) {
                if (!board[newRow][newCol]) {
                    return false;
                }
            }
        }




        return true;

   }

   public static ArrayList<String> display(boolean[][] board){

    ArrayList<String> list = new ArrayList<>();

    for(boolean[] row:board){
      StringBuilder sb = new StringBuilder();
      for(boolean element : row){
        sb.append(element ? "." : "k");

      }
       list.add(sb.toString());
   }
   return list;
   }
}

