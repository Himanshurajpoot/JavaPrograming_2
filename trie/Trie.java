public class Trie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow;

       public  Node(){
        for(int i=0;i<26;i++){
            children[i]=null;
        }
       }

    }

    public  static Node root = new Node();

    public static void insert(String word){ //O(n)
        Node curr = root;
        int idx = 0;
         for(int i=0;i<word.length();i++){
            idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
               curr.children[idx]= new Node();
            }
            curr = curr.children[idx];
         }
         curr.eow= true;
    }

    public  static  boolean search(String word){
        Node curr = root;
        int idx =0;
        for(int i =0;i<word.length();i++){
            idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return  false;
            }
            curr = curr.children[idx];
        }
        return  curr.eow==true;
    }

    public  static  boolean startWith(String word){
        Node curr = root;
        int idx =0;
        for(int i=0;i<word.length();i++){
            idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void buildTree(String word){
        root = new Node();
        for(int i=0;i<word.length();i++){
           insert(word.substring(i));
        }
    }

    public static int countUS(Node root){
     
        if(root==null){
            return 0;
        }

        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countUS(root.children[i]);
            }
        }
        return  count+1;
    }

    public static String ans ="";

    public static void longestWord(Node root, StringBuilder curr){
         if(root==null){
            return ;
         }

        for(int i=0;i<26;i++){
            if(root.children[i]!=null&&root.children[i].eow==true){
               curr.append((char)(i+'a'));
               
               if(curr.length()>ans.length()){
                ans=curr.toString();
            }

            longestWord(root.children[i], curr);
            curr.deleteCharAt(curr.length()-1);
            }

            
         }
    }

    public static void main(String arges[]){
    //    Node curr = root;
     String words[] = {"banana", "a", "app", "appl", "ap", "apply","apple"};

     for(int i =0;i<words.length;i++){
        insert(words[i]);
     }
    //  System.out.println(search("the"));
    //  System.out.println(startWith("k"));
    //  buildTree("ababa");
    //  System.out.println(countUS(root));
     longestWord(root, new StringBuilder(""));
     System.out.println(ans);
    }
}
