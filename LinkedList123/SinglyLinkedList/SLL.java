package LinkedList123.SinglyLinkedList;

import java.util.*;

public class SLL {
    // Singly Linked List class
    // it has a size and nodes
    static int size = 0;
    static Node Head = null;
    static Node Tail = null;

    // constructor
    public SLL() {
    }

    public SLL(ArrayList<Integer> arr) {
        // during SLL creation new Node creation occured
        for (int a : arr) {
            Node node = new Node();

            node.Push(node, a);
        }

    }

    public int getsize() {
        return this.size;
    }

    // Printing Singly linked list

    public void print() {
        // making traversing pointer
        Node travpointer = this.Head;
        while (travpointer != null) {
            if (travpointer.next == null) {
                System.out.println(travpointer.data);
                travpointer = travpointer.next;

            } else {
                System.out.print(travpointer.data + "->");
                travpointer = travpointer.next;
            }
        }
    }

    // INSERTING AT LOCATION

    public void insert(int loc, int val) {
        // create new node whatever be the location
        Node insertnode = new Node();
        insertnode.data = val;
        if (loc == 1) {

            insertnode.next = this.Head;
            this.Head = insertnode;

        } else if (loc > this.getsize()) {
            this.Tail.next = insertnode;
            this.Tail = insertnode;

        } else {
            // create a traverse pointer to go to location-1 node
            int dest = 1;
            Node travpoint = this.Head;
            while (travpoint != null) {
                if (dest == loc - 1) {
                    break;
                }

                travpoint = travpoint.next;
                dest++;
            }
            insertnode.next = travpoint.next;
            travpoint.next = insertnode;

        }
        this.size++;
    }

    public int delete(int loc) {
        int delval = 0;
        // at begining

        if (loc == 1) {
            delval = this.Head.data;

            this.Head = this.Head.next;
        } else if (loc == this.getsize()) {
            Node pointy = this.Head;
            int counter = 1;
            while (pointy != null) {
                if (counter == loc - 1) {
                    break;
                }
                pointy = pointy.next;
                counter++;

            }
            delval = this.Tail.data;
            this.Tail = pointy;
            this.Tail.next = null;

        }

        else {
            Node pointytrav = this.Head;
            int counter = 1;
            while (pointytrav != null) {
                if (counter == loc - 1) {
                    break;
                }
                pointytrav = pointytrav.next;
                counter++;

            }
            delval = pointytrav.next.data;
            pointytrav.next = pointytrav.next.next;

        }
        this.size--;
        return delval;

    }
}
