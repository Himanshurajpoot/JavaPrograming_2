import java.util.*;

public class JavaExercise {
  // Enter 3 numbers from the user & make a function to print their average.

  // public static void printAverage(int a, int b, int c){
  // int sum = a+b+c;
  // System.out.println(sum/3);
  // return;
  // }
  // public static void main(String arge[]){
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int c = sc.nextInt();
  // printAverage(a, b, c);
  // }

  // Write a function to print the sum of all odd numbers from 1 to n.

  // public static void printOddOFSum (int n){
  // 1 approch
  // int sumOffOdd=0;
  // for(int i=1;i<=n;i++){
  // if(i%2!=0){
  // sumOffOdd=sumOffOdd+i;
  // };
  // }

  // System.out.println(sumOffOdd);

  // 2 approch

  // int k = (n+1)/2;
  // System.out.println(k*k);

  // return;
  // }
  // public static void main(String arge[]){
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // printOddOFSum(n);
  // };

  // Q-3 Write a function which takes in 2 numbers and returns the greater of
  // those two.

  // public static int greaterNumber(int a, int b) {
  // return a > b ? a : b;
  // };

  // public static void main(String arge[]) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int greater = greaterNumber(a, b);
  // System.out.println(greater);
  // }

  // Q-4 Write a function that takes in the radius as input and returns the
  // circumference of a circle.

  // public static double radius(int n){
  // double k = 2*3.14*n;
  // return k;
  // };
  // public static void main(String arge[]){
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();

  // System.out.println(radius(n));
  // }

  // Q-5 Write a function that takes in age as input and returns if that person is
  // eligible to vote or not. A person of age > 18 is eligible to vote.

  // public static String eligibleForVote(int n){

  // if(n>18){
  // return "eligible";
  // }else{
  // return "notEligible";
  // }

  // };
  // public static void main(String arge[]){
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // System.out.println(eligibleForVote(n));
  // }

  // Q-6 Write an infinite loop using do while condition.
  // public static void main(String arge[]){
  // int n = 1;

  // do{
  // System.out.println(n);
  // n++;
  // }while(n<10);
  // }

  // Q-7 Write a program to enter the numbers till the user wants and at the end
  // it
  // should display the count of positive, negative and zeros entered.

  // public static void main(String arge[]) {
  // Scanner sc = new Scanner(System.in);
  // int positive = 0;
  // int negative = 0;
  // int zeros = 0;
  // while (true) {
  // System.out.print("Enter Number :");
  // int n = sc.nextInt();

  // if (n > 0) {
  // positive++;
  // } else if (n < 0) {
  // negative++;
  // } else {
  // zeros++;
  // };

  // System.out.print("Do you want to continue? (yes/no): ");
  // String choice = sc.next();

  // if (choice.equalsIgnoreCase("no")) {
  // break;
  // };

  // }

  // System.out.println("positive " + positive);
  // System.out.println("negative " + negative);
  // System.out.println("zeros " + zeros);

  // }

  // Q-8 Two numbers are entered by the user, x and n. Write a function to find
  // the
  // value of one number raised to the power of another i.e. xn.

  // public static void main(String arge[]){
  // Scanner sc = new Scanner(System.in);
  // int x = sc.nextInt();
  // int n = sc.nextInt();
  // double regult = Math.pow(x, n);
  // System.out.println(regult);
  // }

  // Write a function that calculates the Greatest Common Divisor of 2 numbers.
  // (BONUS)

  // public static void commonDivisor(int a, int b) {
    // first approch
    // int n = 1;
    // int k = 0;
    // int min = Math.min(a, b);
    // while (n <= min) {

    // if (a % n == 0 && b % n == 0) {
    // k = n;
    // }
    // n++;
    // }

    // second approch
    // while (b != 0) {
    //   int temp = b;
    //   b = a % b;
    //   a = temp;
    // }

    // System.out.println(a);
  // }

  // public static void main(String arge[]) {
  //   Scanner sc = new Scanner(System.in);
  //   int a = sc.nextInt();
  //   int b = sc.nextInt();
  //   commonDivisor(a, b);
  // }

  // Write a program to print Fibonacci series of n terms where n is input by user
  // :
  // 0 1 1 2 3 5 8 13 21 .....
  // In the Fibonacci series, a number is the sum of the previous 2 numbers that
  // came before it.
  // (BONUS)

  public static void fibonacci(int n){
    int a = 0;
    int b = 1;

    for (int i=1;i<=n;i++){
      System.out.print(a+ " ");
      int next = b;
      b= a+b;
      a=next;

    }
  }

  public static void main(String arge[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   fibonacci(n); 
  }


};
