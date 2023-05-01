package LinkedList123.DoublyLinkedList;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] instructions = {
      "For creating list type -:PUSH 123 here 123 is element",
      "For pushing elements in created list type -: CREATE",
      "For size Type-: SIZE",
      "For Inserting Type-: INSERT loc,value eg-:INSERT 4,300",
      "For Deleting Type-: DELETE loc eg-: DELETE 4",
      "2-> <-4-> <-5",
      "Deleting positions are 1, 2, 3",
      "Inserting positions are 1, 2, 3, 4",
    };

    for (String a : instructions) {
      System.out.println(a);
    }
    System.out.println();

    ArrayList<Integer> arr = new ArrayList<>();
    int value = 0;
    String str = "";
    DLL dLL1 = null;

    String cmd = sc.nextLine();
    while (!cmd.startsWith("END")) {
      // Pushing elements in doublylinked list
      // PUSH 123
      if (cmd.startsWith("PUSH")) {
        str = cmd.substring(5);
        value = Integer.parseInt(str);
        System.out.println("Pushing " + value + "...");
        arr.add(value);
      }
      // creation of linked list by the elements which are pushed
      if (cmd.startsWith("CREATE")) {
        // creation of doubly Linked L
        // Creating object of class DLL

        dLL1 = new DLL(arr);
        System.out.println("Creating...");
        arr.clear();
      }

      if (cmd.startsWith("SHOW")) {
        System.out.println("Showing...");
        dLL1.print();
      }

      if (cmd.startsWith("SIZE")) {
        System.out.println(dLL1.get_Size());
      }

      if (cmd.startsWith("INSERT")) { // INSERT 2,34 INSERT LOC,VALUE
        String[] substr = cmd.substring(7).split(",", 2);
        System.out.println(
          "Inserting " + substr[1] + " at " + substr[0] + "..."
        );
        dLL1.insert(Integer.parseInt(substr[0]), Integer.parseInt(substr[1]));
      }

      if (cmd.startsWith("DELETE")) { // DELETE loc, DELETE 2
        String substr = cmd.substring(7);
        int loc = Integer.parseInt(substr);
        dLL1.delete(loc);
      }
      cmd = sc.nextLine();
    }
  }
}
