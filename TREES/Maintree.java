package TREES;

import java.util.*;

public class Maintree {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter the size of the tree you want-:");
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      arr.add(sc.nextInt());
    }

    String str = sc.nextLine();
    createTree tree = null;
    while (!str.equalsIgnoreCase("END")) {
      if (str.equalsIgnoreCase("CREATE")) {
        tree = new createTree(arr);
      }
      if (str.equalsIgnoreCase("DISPLAY")) {
        tree.display(tree.rootnode);
      }
      if (str.equalsIgnoreCase("SIZE")) {
        System.out.println(tree.sizeOf(tree.rootnode));
      }

      if (str.equalsIgnoreCase("MaxNode")) {
        System.out.println(tree.maxNode(tree.rootnode));
      }
      if (str.equalsIgnoreCase("TellHeight")) {
        System.out.println(tree.TellHeight(tree.rootnode));
      }

      str = sc.nextLine();
    }
  }
}
