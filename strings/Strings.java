import java.util.*;

public class Strings{
    //Q-1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    // public static void main(String arge[]){
    //   Scanner sc = new Scanner(System.in);
    //   int size = sc.nextInt();
    //   String  arr[] = new String[size];
    //   int cout = 0;
    //   for(int i=0;i<size;i++){
    //     arr[i]=sc.next();
    //     cout+=arr[i].length();
    //   }
    //   System.out.println(cout);
    // }

    //Q-2 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    // Example : 
    // original = “eabcdef’ ; result = “iabcdif”
    // Original = “xyz” ; result = “xyz”

    // public static void main(String arge[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
      
      
        // approch 1
        // String result = name.replace("e", "i");
        // System.out.println(result);


        // approch 2
    //     String result = "";
    //     for(int i=0;i<name.length();i++){
    //         if(name.charAt(i) == 'e'){
    //             result+='i';
    //         }else{
    //           result+=name.charAt(i);
    //         }
    //     }

    //     System.out.println(result);
    // }



    // Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    // Example : 
    // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
    // email = “helloWorld123@gmail.com”; username = “helloWorld123”
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String username= "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username+=email.charAt(i);
            }
        }
        System.out.println(username);
    }

}