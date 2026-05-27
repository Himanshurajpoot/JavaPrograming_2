import java.util.HashSet;
import java.util.ArrayList;
public class Recursion_class_1 {

    // class-1

    // Q1. Print numbers from 5 to 1.
    // public static void printNumber(int n){
    // if(n==0){
    // return;
    // }
    // System.out.println(n);
    // printNumber(n-1);
    // }

    // public static void main(String arge[]){
    // int n =5;
    // printNumber(n);
    // }

    // Print numbers from 1 to 5.
    // public static void printNumber(int n){
    // if(n==6){
    // return;
    // }
    // System.out.println(n);
    // printNumber(n+1);
    // }
    // public static void main(String arge[]){
    // int n =1;
    // printNumber(n);
    // }

    // Print the sum of first n natural numbers.
    // public static void printSum(int n , int sum){
    // if(n==0){
    // System.out.println(sum);
    // return;
    // };
    // sum+=n;
    // printSum(n-1,sum);

    // }
    // public static void main(String arge[]){
    // int n = 5;
    // int sum =0;
    // printSum(n, sum);
    // }

    // Q4. Print factorial of a number n.
    // public static void printFactorial(int n , int fac){
    // if(n==0){
    // System.out.println(fac);
    // return;
    // }
    // fac*=n;
    // printFactorial(n-1, fac);
    // }
    // public static void main(String arge[]){
    // int n=5;
    // int fac=1;
    // printFactorial(n, fac);
    // }

    // Q5. Print the fibonacci sequence till nth term.
    // public static void printFibonacci(int a, int b, int n){
    // if(n==0){
    // return;
    // }
    // System.out.println(a);
    // printFibonacci(b, a+b, n-1);
    // }

    // public static void main(String arge[]){
    // int n =8;
    // int a=0;
    // int b=1;
    // printFibonacci(a, b, n);
    // }

    // Q6. Print x^n (with stack height = n)
    // public static int printPower(int x, int n){
    // if(n==0){
    // return 1;
    // }

    // if(x==0){
    // return 0;
    // };
    // int x_ = printPower(x, n-1);
    // int xn = x_*x;
    // return xn;

    // }

    // public static void main(String arge[]){
    // int n =5;
    // int x =2;

    // int output = printPower(x, n);
    // System.out.println(output);
    // }

    // Print x^n (with stack height = logn)
    // public static int printPower(int x, int n){
    // if(n==0){
    // return 1;
    // };

    // if(n%2==0){
    // return printPower(x, n/2)* printPower(x, n/2) ;
    // }else{
    // return x* printPower(x, n/2)* printPower(x, n/2) ;
    // }

    // };

    // public static void main(String arge[]){
    // int n =5;
    // int x =2;

    // int output = printPower(x, n);
    // System.out.println(output);
    // }

    // class-2

    // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3
    // towers.
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }

    // // transfer top n-1 from src to helper using dest as helper
    // towerOfHanoi(n - 1, src, dest, helper);

    // // transfer nth from src to dest
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);

    // // transfer n-1 from helper to dest using src as 'helper'
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void main(String arge[]) {
    // int n = 2;
    // towerOfHanoi(n, "A", "B", "C");
    // }

    // Q2. Print a string in reverse.

    // public static String reverseStr(String str){
    // if(str.length()==1){
    // return str;
    // }

    // char currChar = str.charAt(0);
    // String nextString = reverseStr(str.substring(1));
    // return nextString+currChar;
    // }
    // public static void main(String arge[]){
    // String str = "abcd";
    // String newStr=reverseStr(str);
    // System.out.println(newStr);
    // }

    // Q3. Find the occurrence of the first and last occurrence of an element using
    // recursion.
    // public static int first =-1;
    // public static int second =-1;
    // public static void occurrence(String str , char el , int idx){
    // if(idx==str.length()){
    // return;
    // }
    // char currentChar = str.charAt(idx);
    // if(currentChar==el){
    // if(first==-1){
    // first=idx;
    // }else{
    // second=idx;
    // }
    // }
    // occurrence(str, el, idx+1);
    // };
    // public static void main(String arge[]){
    // String str = "aalal";
    // char el ='a';
    // occurrence(str, el, 0);
    // System.out.println(first);
    // System.out.println(second);
    // }

    // Q4. Check if an array is sorted (strictly increasing). - O(n)

    // public static boolean checkInc(int arr[], int idx){
    // if(idx==arr.length-1){
    // return true;
    // }

    // if(arr[idx]>=arr[idx+1]){
    // return false;

    // };
    // return checkInc(arr, idx+1);
    // }
    // public static void main(String arge[]){
    // int arr[]={1,2,3,4,5,6,6};
    // int arr2[]={1,2,6,4,5,3};

    // if(checkInc(arr, 0)){
    // System.out.println("Strictly Increasing");
    // }else{
    // System.out.println("NOT Strictly Increasing");
    // }
    // }

    // Q5. Move all ‘x’ to the end of the string. - O(n)

    // public static String allmove( int count){
    // String newstr ="";
    // for(int i=0;i<count;i++){
    // newstr+="x";
    // }
    // return newstr;
    // }
    // public static String moveX(String str , int idx, int count){
    // if(idx==str.length()){
    // return allmove( count);
    // }

    // int addCount = count;
    // if(str.charAt(idx)=='x'){
    // return moveX(str, idx+1, addCount+1);
    // }else{
    // String newStr = moveX(str, idx+1, addCount);
    // return str.charAt(idx)+newStr;

    // }

    // }
    // public static void main(String arge[]){
    // String str = "xuebfnxnxxnxx";
    // int count =0;
    // String st = moveX(str, 0, count);
    // System.out.println(st);
    // }

    // Q6. Remove duplicates in a string.
    // public static String removeDuplicate(String str ,int idx, boolean arr[]){
    // if(idx==str.length()){
    // return "";
    // };
    // char current = str.charAt(idx);
    // if(arr[current-'a']){
    // return removeDuplicate(str, idx+1, arr);
    // }else{
    // arr[current-'a']=true;
    // return current+ removeDuplicate(str, idx+1, arr);

    // }

    // }
    // public static void main(String arge[]){
    // String str ="jnadnjdjjjdkk";
    // boolean present[] = new boolean[26];
    // String s = removeDuplicate(str,0, present);
    // System.out.println(s);

    // }

    // Q7. Print all the subsequences of a string.

    // public static void printSunbsequences(String str , int idx, String newstr){
    // if(idx==str.length()){
    // System.out.println(newstr);
    // return;
    // }

    // char curr = str.charAt(idx);

    // printSunbsequences(str, idx+1,newstr+curr);

    // printSunbsequences(str, idx+1,newstr);

    // }

    // public static void main(String arge[]){
    // String str = "abc";
    // printSunbsequences(str, 0, "");

    // }

    // Q8. Print all unique subsequences of a string.
    // public static void printSunbsequencesUniq(String str, int idx, String newstr,
    // HashSet<String> allSubseq) {
    // if(idx==str.length()){
    // if(allSubseq.contains(newstr)){
    // return;
    // }else{
    // System.out.println(newstr);
    // allSubseq.add(newstr);
    // return;
    // }

    // }

    // char curr = str.charAt(idx);
    // printSunbsequencesUniq(str, idx+1, newstr+curr, allSubseq);

    // printSunbsequencesUniq(str, idx+1, newstr, allSubseq);
    // }

    // public static void main(String arge[]) {
    // String str = "aaa";
    // HashSet<String> allSubseq = new HashSet<>();
    // printSunbsequencesUniq(str, 0, "", allSubseq);
    // }

    // Q9. Print keypad combination
    // ( 0 -> .;
    // 1 -> abc
    // 2 -> def
    // 3 -> ghi
    // 4 -> jkl
    // 5 -> mno
    // 6 -> pqrs
    // 7 -> tu
    // 8 -> vwx
    // 9 -> yz
    // )

    // public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno",
    // "pqrs","tu", "vwx", "yz"};
    // public static void printCombination(String str, int idx, String newStr){
    // if(idx==str.length()){
    // System.out.println(newStr);
    // return;
    // }

    // for(int i=0;i<keypad[str.charAt(idx)-'0'].length();i++){
    // char curr = keypad[str.charAt(idx)-'0'].charAt(i);
    // printCombination(str, idx+1, newStr+curr);
    // }

    // }
    // public static void main(String arge[]){
    // String str ="23";
    // printCombination(str, 0, "");
    // }

    // class -3
    // ADVANCED

    // Q1. Print all the permutations of a string.

    // public static void printPermutations(String str, String perm) {

    //     if (str.length() == 0) {
    //         System.out.println(perm);
    //         return;
    //     }

    //     for (int i = 0; i < str.length(); i++) {

    //         char curr = str.charAt(i);

    //         String newString = str.substring(0, i)+ str.substring(i + 1);

    //         printPermutations(newString, perm + curr);
    //     }
    // }

    // public static void main(String args[]) {

    //     String str = "abc";

    //     printPermutations(str, "");
    // }

    // Q2. CountPathMaze 

    // public static int countPathMaze(int n,int m, int i, int j){
    //     if(i==m-1 || j==n-1){
    //         return 1;
    //     };

    //    return  countPathMaze(n, m, i+1, j) + countPathMaze(n, m, i, j+1);


    // }
    // public static void main(String arge[]){
    //     int n = 3;
    //     int m = 3;
    //   int count = countPathMaze(n, m, 0, 0);
    //   System.out.println(count);
    // }

    // Q3. Tiling problem
    // public static int tiling(int n, int m){
    //     if(n<m){
    //         return 1;
    //     }else if(n==m){
    //         return 2;
    //     };
    //     // verticly
    //   int vertcaly =  tiling(n-m, m);
    //    //   horizontly
    //   int horijontaly = tiling(n-1, m);
    //     return  vertcaly+horijontaly;
    // }
    // public static void main(String arge[]){
    //     int n = 4;
    //     int m = 2;
    //     System.out.println(tiling(n, m));
    // }

    // Q4. Friends pairing problem

    // public static int pairing (int n){
    //     if(n<=1){
    //         return 1;
    //     };

    //     // single
    //     int single = pairing(n-1);
    //     // pairing 
    //     int pairing = (n-1)*pairing(n-2);

    //     return single+pairing;

        
    // }

    // public static void main(String arge[]){
    //     int gest = 4;
    //   System.out.println(pairing(gest));
    // }

    // Q5. Subsets of a set






   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }


   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }

       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
       findSubsets(n-1, subset);
       
   }


   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   };




}
