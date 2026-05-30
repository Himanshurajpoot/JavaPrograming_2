import java.util.ArrayList;
import java.util.List;

public class Backtracking{
    // Print all Permutations

    // public static void parmutation(String str, String param){

    //     if(str.length()==0){
    //         System.out.println(param);
    //         return;
    //     }
       
    //     for(int i=0;i<str.length();i++){
    //         char curr = str.charAt(i);
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         parmutation(newStr, param+curr);
    //     }
    // }
    // public static void main(String arge[]){
    //     String str = "abc";
    //    parmutation(str, "");
    // }

    
//     public static boolean isSafe(char board[][], int row, int col){

//     // left row
//     for(int c = col; c >= 0; c--){
//         if(board[row][c] == 'Q'){
//             return false;
//         }
//     }

//     // upper-left diagonal
//     for(int r = row, c = col; r >= 0 && c >= 0; r--, c--){
//         if(board[r][c] == 'Q'){
//             return false;
//         }
//     }

//     // lower-left diagonal
//     for(int r = row, c = col; r < board.length && c >= 0; r++, c--){
//         if(board[r][c] == 'Q'){
//             return false;
//         }
//     }

//     return true;
// }

//     public static void saveBoard(char board[][],List<List<String>>allboard){
//           List<String> newBoard = new ArrayList<>();
//           for(int i=0;i<board.length;i++){
//             String row ="";
//             for(int j=0;j<board[i].length;j++){
//                 if(board[i][j]=='Q'){
//                     row+='Q';
//                 }else{
//                     row+='.';
//                 }
//             }
//             newBoard.add(row);
//           }

//           allboard.add(newBoard);
//     }

//     public static void helper(char board[][], List<List<String>>allboard, int col){

//         if(col==board.length){
//             saveBoard(board,allboard);
//             return;
//         }
//         for(int row = 0;row<board.length; row++){
//             if(isSafe(board,row,col)){
//                 board[row][col]='Q';
//                 helper(board,allboard,col+1);
//                 board[row][col]='.';
//             }
//         }
//     }

//      public List<List<String>> solveNQueens(int n) {
//          List<List<String>> allboard = new ArrayList<>();
//          char[][] board = new char[5][5];
//          helper(board, allboard,0);
//          return allboard;
//      }

    //    KnightL

        // public static int helper(int row,int col, int a, int b, int n, boolean visited[][]){
        //    if(row<0||col<0||row>=n||col>=n){
        //     return Integer.MAX_VALUE;
        //    }
        //    if(visited[row][col]){
        //     return Integer.MAX_VALUE;
        //    }
        //    if(row==n-1&&col==n-1){
        //     return 0;
        //    }

        //    visited[row][col]=true;

        //    int dir[][] ={{a,b},{a,-b},{-a,b},{-a,-b},{b,a},{b,-a},{-b,a},{-b,-a}};

        //    int min = Integer.MAX_VALUE;

        //   for(int i=0;i<8;i++){
        //     int nr = row+dir[i][0];
        //     int nc = col+dir[i][1];

        //     int res = helper(nr, nc, a, b, n, visited);
        //     if(res != Integer.MAX_VALUE){
        //         min = Math.min(min, 1+res);
        //     }
        //   }

        //   visited[row][col] = false;
        //   return min;

        // }


        // public static List<List<Integer>> KnightlOnAChessboard(int n){
        //    List<List<Integer>> ans = new ArrayList<>();
        //    for(int a=1;a<n;a++){
        //      List<Integer> row = new ArrayList<>();
        //      for(int b=1;b<n;b++){
        //         boolean visited[][] = new boolean[n][n];
        //         int mooves=helper(0,0,a,b,n,visited);
        //         if(mooves==Integer.MAX_VALUE){
        //             row.add(-1);
        //         }else{
        //             row.add(mooves);
        //         }
        //      }
        //      ans.add(row);
        //    }
        //    return ans;
        // }

        // public static void main(String arge[]){
        //    System.out.println( KnightlOnAChessboard(5));
        // }
        

        // suduku problum

        public boolean isSafe(char[][] board, int row, int col, int number) {
       //column
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == (char)(number+'0')) {
               return false;
           }
       }
      
       //row
       for(int j=0; j<board.length; j++) {
           if(board[row][j] == (char)(number+'0')) {
               return false;
           }
       }
      
       //grid
       int sr = 3 * (row/3);
       int sc = 3 * (col/3);
      
       for(int i=sr; i<sr+3; i++) {
           for(int j=sc; j<sc+3; j++) {
               if(board[i][j] == (char)(number+'0')) {
                   return false;
               }
           }
       }

          
       return true;
   }
  
   public boolean helper(char[][] board, int row, int col) {
       if(row == board.length) {
           return true;
       }
      
       int nrow = 0;
       int ncol = 0;
      
       if(col == board.length-1) {
           nrow = row + 1;
           ncol = 0;
       } else {
           nrow = row;
           ncol = col + 1;
       }
      
       if(board[row][col] != '.') {
           if(helper(board, nrow, ncol)) {
               return true;
           }
       } else {
          
           //fill the place
           for(int i=1; i<=9; i++) {
               if(isSafe(board, row, col, i)) {
                   board[row][col] = (char)(i+'0');
                   if(helper(board, nrow, ncol))
                       return true;
                   else
                        board[row][col] = '.';
               }
           }
       }
                     
       return false;
   }
  
   public void solveSudoku(char[][] board) {
       helper(board, 0, 0);
   }





}
