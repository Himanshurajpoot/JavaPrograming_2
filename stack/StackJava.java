import java.util.*;
public class StackJava {

    // stack impementation
  

    //using  java collections fremwork

    // public static void main(String arge[]){
    //     Stack<Integer> s = new Stack<>();

    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);

    //     while (!s.isEmpty()) {
    //         System.out.println(s.peek());
    //         s.pop();
    //     }

        
    // }

  
    // using ArrayList

    // static class InnerStackJava {
    //  ArrayList<Integer> list = new ArrayList<>();

    //   public void push(int data){
    //     list.add(data);
    //   }

    //   public boolean isEmpty(){
    //     return list.size()==0;
    //   }

    //   public int  pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top = list.remove(list.size()-1);
    //     return top;
    //   }

    //   public int peek(){
    //     if (isEmpty()) {
    //         return -1;
    //     }

    //     return list.get(list.size()-1);
    //   }
        
    // }

    // public static void main(String arge[]){
    //     InnerStackJava stack = new InnerStackJava();

    //     stack.push(1);
    //     stack.push(2);
    //     stack.push(3);
    //     stack.push(4);

    //     while (!stack.isEmpty()) {
    //         System.out.println(stack.peek());
    //         stack.pop();
    //     }
    // }

    // using linkedList

    // private static class Node{
    //     int data;
    //     Node next;

    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
        
    // }

    // static class  Stack{
    //   public static Node head= null;

    //   public static void push(int data){
    //     Node newNode = new Node(data);
    //     if(head==null){
    //         head=newNode;
    //         return;
    //     }
    //     newNode.next= head;
    //     head=newNode;
    //   }

    //   public  static boolean isEmpty(){
    //     return head==null;
    //   }

    //   public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }

    //     Node top = head;
    //     head= head.next;
    //     return top.data;
    //   }

    //   public static int peek(){
    //     if(isEmpty()){
    //       return -1;
    //     }

    //     Node top = head;
    //     return top.data;
    //   }

        
    // }

    // public static void main(String arge[]){
    //   Stack s = new Stack();
    //   s.push(1);
    //   s.push(2);
    //   s.push(3);
    //   s.push(4);

    //   while (!s.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    //   }
    // }


    //To push an element at the bottom of a stack

    // public static void pushAtBottom( Stack<Integer> s, int data){
    //     if(s.isEmpty()){
    //       s.push(data);
    //       return;
    //     }

    //     int temp = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(temp);
    // }

    // public static void main(String arge[]){
    //   Stack<Integer> s = new Stack<>();

    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);
    //     pushAtBottom(s,5);
    //     while (!s.isEmpty()) {
    //       System.out.println(s.peek());
    //       s.pop();
    //     }
    // }

    //Code to Reverse a Stack

    public static void pushAtBottom( Stack<Integer> s, int data){
        if(s.isEmpty()){
          s.push(data);
          return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Integer> s ){
        if(s.isEmpty()){
          return;
        }

        int data = s.pop();
        reverse(s);
        pushAtBottom(s, data);
    }
   
    public static void main(String arge[]){
      Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();
        }
    }
    
}