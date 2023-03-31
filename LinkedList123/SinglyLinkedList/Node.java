package LinkedList123.SinglyLinkedList;
// Singly linked list is just a few nodes interlinked to each other
public class Node extends SLL {
    int data;
    Node next;

    // constructor

    public Node() {

        this.data = 0;
        this.next = null;
    }

    // Push method to construct a linkedlist
    public void Push(Node nd, int data) {
        if (super.getsize() == 0) {
            nd.data = data;
            this.Head = nd;
            this.Tail = nd;

            super.size++;

        } else {

            nd.data = data;
            this.Tail.next = nd;
            this.Tail = nd;
            super.size++;

        }

    }

    
}
