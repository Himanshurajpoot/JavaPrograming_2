
// print the pettern

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


// public class AdvancePettrn {
//     public static void main(String arge[]) {
//         int n = 4;

//         // first part
//         for (int i = 1; i <= n; i++) {

//             // upper helf
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // spaces
//             int space = 2 * (n - i);
//             for (int j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }

//             // upper second half
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // secend pard

//         // lower first helf
//         for (int i = n; i >= 1; i--) {
//             // lower helf
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // spaces
//             int space = 2 * (n - i);
//             for (int j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }

//             // lower second half
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


// print this pettern
//     *****  
//    *****   
//   *****    
//  *****     
// ***** 


// public class AdvancePettrn {
//     public static void main(String arge[]) {
//         int n = 5;

//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }


//             System.out.println();
//         }

//     }
// }


// print this 
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

// public class AdvancePettrn {
//     public static void main(String arge[]) {
//         int n = 5;

//         for(int i = 1;i<=n;i++){
//             int num =i;
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" "); 
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+ " ");
//             }

           

    
//             System.out.println();
//         }

//     }
// }


// print the pettern
//     1
//    212
//   32123
//  4321234
// 543212345

// public class AdvancePettrn {
//     public static void main(String arge[]) {
//         int n = 5;

//         for(int i = 1;i<=n;i++){
//             int num =i;
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" "); 
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }

//             for(int j =2;j<=i;j++){
//                 System.out.print(j);
//             }

    
//             System.out.println();
//         }

//     }
// }



// print the pettern
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *


public class AdvancePettrn {
    public static void main(String arge[]) {
        int n = 4;

        for(int i = 1;i<=n;i++){
            // space
            
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

           


            System.out.println();
        }


        for(int i = n;i>=1;i--){
           
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

           
            System.out.println();
        }

    }
}