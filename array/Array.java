import java.util.*;

public  class Array {


    // Take an array of names as input from the user and print them on the screen.

//     public static void main(String arge[]){
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//     //   sc.nextLine();
//       String names[] =new String[size];

//       for(int i =0;i<size;i++){
//         names[i]= sc.nextLine();
//       }

//       for(int i=0;i<names.length;i++){{
//         System.out.println(names[i]);
//       }}
//    }


// Find the maximum & minimum number in an array of integers. 

    // public static void main(String arge[]){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int arr[] = new int[size];

    //     for(int i=0;i<size;i++){
    //         arr[i]= sc.nextInt();
    //     };

    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;

    //     for(int i =0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }

    //         if(min>arr[i]){
    //             min=arr[i];
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(min);
    // };



    // Take an array of numbers as input and check if it is an array sorted in ascending order.
    //  Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    //    {3, 4, 6, 2} is not sorted in ascending order.

    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        };


        boolean assOrNot = true;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
            assOrNot = false;
           }
        }

        if(assOrNot){
            System.out.println("is assending");
        }else{
            System.out.println("is not assending");

            // dfghjk
        }
       
    }
};