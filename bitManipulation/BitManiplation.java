// Homework Problems




// Q-4 Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

import java.util.*;
public class BitManiplation {
  // Q-1 Write a program to find if a number is a power of 2 or not.
//   public static void main(String arge[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     boolean result = (n>0)&&((n &(n-1))==0);
    
//    if(result){
//     System.out.println("a number is power of 2");
//    }else{
//     System.out.println("a number is not power of 2");
//    }
//   }


// Q-2 Write a program to toggle a bit a position = “pos” in a number “n”.
//   public static void main(String arge[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int pos = 1;
//     int bitMask = 1<<pos;
//     int newNumber = bitMask^n;
//     System.out.println(newNumber);

//   }


// Q-3 Write a program to count the number of 1’s in a binary representation of the number.

// public static void main(String arge[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int count =0;
//    while (n>0) {
//     if((n&1)==1){
//       count++;
     
//     }
//      n=n>>1;
//    };
//    System.out.println(count);
// }


// Q-4 Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

public static void decimalToBinary(int n){
    int binary = 0;
    int place  =1;
     while (n>0) {
        int rem = n%2;
        binary = binary +rem*place;
        place = place*10;
        n=n/2;
     }
     System.out.println(binary);

}

public static void binaryToDecimal(int n){
    int desimal =0;
    int pow = 1;
   while (n>0) {
     int lastdigit = n%10;
     desimal = desimal +(lastdigit*pow);
     pow=pow*2;
     n=n/10;
   }
   System.out.println(desimal);
}
public static void main(String arge[]){
    decimalToBinary(13);
    binaryToDecimal(1010);
}

}