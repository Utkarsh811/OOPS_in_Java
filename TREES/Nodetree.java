package TREES;

import java.util.*;

public class Nodetree {

  int data;
  ArrayList<Nodetree> children = null;

  //constructor
  public Nodetree() {}

  public Nodetree(int data) {
    //whenever we made a new node it has a data and a dynamic array of nodes to store links of other node
    this.data = data;
    this.children = new ArrayList<>();
  }
}
