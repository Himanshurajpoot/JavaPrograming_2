public class Recursion_class_1 {
    // Q1. Print numbers from 5 to 1.
    // public static void printNumber(int n){
    //     if(n==0){
    //         return;
    //     }
    //   System.out.println(n);
    //   printNumber(n-1);
    // }

    // public static void main(String arge[]){
    //     int n =5;
    //     printNumber(n);
    // }

    // Print numbers from 1 to 5.
    // public static void printNumber(int n){
    //     if(n==6){
    //         return;
    //     }
    //   System.out.println(n);
    //   printNumber(n+1);
    // }
    // public static void main(String arge[]){
    //     int n =1;
    //     printNumber(n);
    // }

    // Print the sum of first n natural numbers.
    // public static void printSum(int n , int sum){
    //     if(n==0){
    //         System.out.println(sum);
    //         return;
    //     };
    //    sum+=n;
    //    printSum(n-1,sum);
       
    // }
    // public static void main(String arge[]){
    //     int n = 5;
    //     int sum =0;
    //   printSum(n, sum);
    // }

    // Q4. Print factorial of a number n.
    // public static void printFactorial(int n , int fac){
    //     if(n==0){
    //         System.out.println(fac);
    //         return;
    //     }
    //     fac*=n;
    //     printFactorial(n-1, fac);
    // }
    // public static void main(String arge[]){
    //     int n=5;
    //     int fac=1;
    //   printFactorial(n, fac);
    // }

    // Q5. Print the fibonacci sequence till nth term.
    // public static void printFibonacci(int a, int b, int n){
    //     if(n==0){
    //         return;
    //     }
    //      System.out.println(a);
    //      printFibonacci(b, a+b, n-1);
    // }

    // public static void main(String arge[]){
    //     int n =8;
    //     int a=0;
    //     int b=1;
    //    printFibonacci(a, b, n);
    // }

    // Q6. Print x^n (with stack height = n)
    // public static int printPower(int x, int n){
    //     if(n==0){
    //        return 1;
    //     }

    //     if(x==0){
    //         return 0;
    //     };
    //  int x_ = printPower(x, n-1);
    //  int xn = x_*x;
    //  return xn;

    // }

    // public static void main(String arge[]){
    //   int n =5;
    //   int x =2;
     
    //  int output = printPower(x, n);
    //  System.out.println(output);
    // }

    // Print x^n (with stack height = logn)
    public static int printPower(int x, int n){
        if(n==0){
           return 1;
        };

    if(n%2==0){
      return printPower(x, n/2)* printPower(x, n/2) ;
    }else{
      return x* printPower(x, n/2)* printPower(x, n/2) ;
    }
     

    };

    public static void main(String arge[]){
      int n =5;
      int x =2;
     
     int output = printPower(x, n);
     System.out.println(output);
    }

}
