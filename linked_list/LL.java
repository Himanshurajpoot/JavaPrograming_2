
import java.util.*;

class LL {

    // LinkedList class Implementation (Collection Framework)

    // public static void main(String args[]) {
    // LinkedList<String> list = new LinkedList<String>();
    // list.add("is");
    // list.add("a");
    // list.addLast("list");
    // list.addFirst("this");
    // list.add(3, "linked");
    // System.out.println(list);

    // System.out.println(list.get(0));
    // System.out.println(list.size());
    // list.remove(3);
    // list.removeFirst();
    // list.removeLast();

    // System.out.println(list);
    // }

    // Scratch Implementation (Important for BEGINNERS)

    // Node head;
    // private int size;

    // LL() {
    // size = 0;
    // }

    // public class Node {
    // String data;
    // Node next;

    // Node(String data) {
    // this.data = data;
    // this.next = null;
    // size++;
    // }

    // }

    // public void addFirst(String data) {
    // Node newnode = new Node(data);
    // newnode.next = head;
    // head = newnode;

    // }

    // public void addLast(String data) {
    // Node newnode = new Node(data);
    // if (head == null) {
    // head = newnode;
    // return;
    // }

    // Node lastNode = head;

    // while (lastNode.next != null) {
    // lastNode = lastNode.next;
    // }
    // lastNode.next = newnode;
    // }

    // public void printList() {
    // Node currNode = head;

    // while (currNode != null) {
    // System.out.print(currNode.data + " -> ");
    // currNode = currNode.next;
    // }
    // System.out.println("null");
    // }

    // public void removeFirst() {
    // if (head == null) {
    // System.out.println("Empty List, Nothing to delele");
    // return;
    // }
    // head = this.head.next;
    // size--;

    // }

    // public void removeLast() {
    // if (head == null) {
    // System.out.println("Empty List, Nothing to delele");
    // return;
    // }

    // size--;
    // if (head.next == null) {
    // head = null;
    // return;
    // }

    // Node cuuent = head;
    // Node lastNode = head.next;
    // while (lastNode.next != null) {
    // cuuent = cuuent.next;
    // lastNode = lastNode.next;
    // }
    // cuuent.next = null;

    // }

    // public int getSize() {
    // return size;
    // }

    // public static void main(String arge[]) {
    // LL list = new LL();
    // list.addLast("is");
    // list.addLast("a");
    // list.addLast("list");
    // list.printList();

    // list.addFirst("this");
    // list.printList();
    // System.out.println(list.getSize());

    // list.removeFirst();
    // list.printList();

    // list.removeLast();
    // list.printList();

    // }

    // public void addMiddle(int index, String data) {

    // if (index < 0 || index > size) {
    // System.out.println("Invalid Index");
    // return;
    // }

    // Node newNode = new Node(data);

    // if (index == 0) {
    // newNode.next = head;
    // head = newNode;
    // return;
    // }

    // Node currNode = head;

    // for (int i = 0; i < index - 1; i++) {
    // currNode = currNode.next;
    // }

    // newNode.next = currNode.next;
    // currNode.next = newNode;
    // }

    // Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    // Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
    Node head;
    int size;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;

        }

        lastNode.next = newNode;
    }

    public int search(int num) {
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }

        Node current = head;
        int count = 0;
        while (current.next != null) {
           if (current.data == num) {
            return count;
            }
            current = current.next;
            count++;
        }

       return -1;
    }

    public void remove() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Remove nodes from the beginning if they are > 25
    while (head != null && head.data > 25) {
        head = head.next;
    }

    // If all nodes were removed
    if (head == null) {
        return;
    }

    Node prev = head;
    Node curr = head.next;

    while (curr != null) {
        if (curr.data > 25) {
            prev.next = curr.next;   // Remove current node
        } else {
            prev = curr;             // Move prev only if current is kept
        }
        curr = curr.next;            // Move to next node
    }
}

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }

    public static void main(String arge[]) {
        LL list = new LL();
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }
        list.print();
        list.remove();
        list.print();
        System.out.println(list.search(7));
    }

}
