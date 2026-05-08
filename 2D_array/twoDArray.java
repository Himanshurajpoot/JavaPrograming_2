import java.util.*;

public class TwoDArray {
   //  Print the spiral order matrix as output for a given matrix of numbers. 
  // public static void main(String arge[]){
   
    
  //   Scanner sc = new Scanner(System.in);
  //   int n = sc.nextInt();
  //   int m = sc.nextInt();
  //   int matrix[][] = new int[n][m];
  //   for(int i =0;i<n;i++){
  //     for(int j = 0;j<m;j++){
  //       matrix[i][j]=sc.nextInt();
  //     }
  //   }
  //   for(int i=0;i<n;i++){
  //     for(int j=0;j<m;j++){
  //       System.out.print(matrix[i][j]);
  //     }
  //     System.out.println();
  //   }

  //   int row_start =0;
  //   int row_end = n-1;
  //   int column_start = 0;
  //   int column_end = m-1;

  //   while (row_start<=row_end && column_start<=column_end) {

  //     for(int col = column_start;col<=column_end;col++){
  //       System.out.print(matrix[row_start][col] + " ");
  //     }

  //     row_start++;

  //     for(int row= row_start;row<=row_end;row++ ){
  //       System.out.print(matrix[row][column_end] + " ");
  //     }
  //     column_end--;
 
  //     for(int col=column_end;col>=column_start;col--){
  //       System.out.print(matrix[row_end][col]+ " ");
  //     }

  //     row_end--;

  //     for(int row=row_end;row>=row_start;row--){
  //       System.out.print(matrix[row][column_start]+ " ");
  //     }
  //     column_start++;
      
  //     System.out.println();
  //   }
  // }



    //Q-2 For a given matrix of N x M, print its transpose.

    public static void main(String arge[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int matrix[][] = new int[n][m];

      for(int i=0;i<n;i++){
        for(int j = 0; j<m; j++){
          matrix[i][j]= sc.nextInt();
        }
      }

      for(int i = 0; i<n;i++){
        for(int j=0;j<m;j++){
          System.out.print(matrix[i][j]);
        }
      }

      int row = 0;
      int col = 0;
      for(int j =0;j<m;j++){
        for(int i=0;i<n;i++){

          System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
      }
    }
}