import java.io.*;
import java.util.*;

class Node {

  int data;
  Node next;

  Node(int a) {
    data = a;
    next = null;
  }
}

class GfG {

  static Scanner sc = new Scanner(System.in);

  public static Node inputList(int size) {
    Node head, tail;
    int val;

    val = sc.nextInt();

    head = tail = new Node(val);

    size--;

    while (size-- > 0) {
      val = sc.nextInt();
      tail.next = new Node(val);
      tail = tail.next;
    }

    return head;
  }

  public static void printList(Node n) {
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
  }

  public static void main(String args[]) {
    System.out.println("Enter t");
    int t = sc.nextInt();
    while (t-- > 0) {
      int n, m;

      n = sc.nextInt();
      Node head1 = inputList(n);

      m = sc.nextInt();
      Node head2 = inputList(m);

      Sol obj = new Sol();

      printList(obj.findUnion(head1, head2));
      System.out.println();
    }
  }
}

// } Driver Code Ends

/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol {

  public static boolean isNotPresent(ArrayList<Integer> arr, int val) {
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == val) return false;
    }
    return true;
  }

  public static void connectList(Node t, Node h) {}

  public static Node findUnion(Node head1, Node head2) {
    //Add your code here.
    ArrayList<Integer> arr = new ArrayList<>();
    Node tras = head1;
    while (tras != null) {
      if (isNotPresent(arr, tras.data)) {
        arr.add(Integer.valueOf(tras.data));
      }
    }
    System.out.println(arr);
    Node tra = head2;
    while (tra != null) {
      if (isNotPresent(arr, tra.data)) {
        arr.add(Integer.valueOf(tra.data));
      }
    }
    System.out.println(arr);
    return head1;
  }
}
