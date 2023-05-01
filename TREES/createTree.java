package TREES;

import java.util.*;

public class createTree extends Nodetree {

  static Nodetree rootnode = null;

  int size = 0;
  Stack<Nodetree> stck;
  int maxelem = Integer.MIN_VALUE;

  //constructor
  public createTree() {}

  public createTree(ArrayList<Integer> arr) {
    //inserting element into the stack and creating tree
    this.stck = new Stack();
    for (int i = 0; i < arr.size(); i++) {
      CreateNode(arr.get(i));
    }
  }

  //methods

  public void CreateNode(int data) {
    if (stck.empty()) {
      //Making a root node
      rootnode = new Nodetree(data);
      stck.push(rootnode);
      //size++;
    } else {
      //creating descendents
      if (data == -1) {
        stck.pop();
      } else {
        Nodetree newnd = new Nodetree(data);
        stck.peek().children.add(newnd);
        stck.push(newnd);
        //size++;
      }
    }
  }

  //DISPLAYING TREE

  public void display(Nodetree nd) {
    System.out.println(nd.data + "-> ");
    for (Nodetree a : nd.children) {
      display(a);
    }
  }

  //SIZE
  public int sizeOf(Nodetree nd) {
    size++;
    for (Nodetree a : nd.children) {
      sizeOf(a);
    }
    return size;
  }

  //FINDING MAXIMUM NODE IN THE TREE
  public int maxNode(Nodetree nd) {
    if (maxelem < nd.data) {
      //System.out.println(maxelem + "," + nd.data);
      maxelem = nd.data;
    }

    for (Nodetree a : nd.children) {
      maxNode(a);
    }

    return maxelem;
  }

  //FINDING HEIGHT OF THE TREE
  public int TellHeight(Nodetree nd) {
    int ht = -1;
    for (Nodetree child : nd.children) {
      int ch = TellHeight(child);
      ht = Math.max(ch, ht);
    }
    ht = ht + 1;
    return ht;
  }
}
