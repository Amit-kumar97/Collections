package LinkedLists;

public class Reverse_LinkedList {

/*
 Java Program to reverse a singly list without using recursion.
 */
    public static void main(String[] args)
    {
        //------------creating a singly linked list SinglyLinkedList.
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList list = new SinglyLinkedList(head);
        //----------adding node into singly linked list
        list.add(new SinglyLinkedList.Node(2));
        list.add(new SinglyLinkedList.Node(3));
        //-----------printing a singly linked list
        list.print();
        //-----------reversing the singly linked list
        list.reverse();
        //-----------printing the singly linked list again
        list.print();
    }
}
class SinglyLinkedList
{
    static class Node
    {
        private int data;
        private Node next;
        public Node(int data)
        {
            this.data = data;
        }
        public int data()
        {
            return data;
        }
        public Node next()
        {
            return next;
        }
    }
    private Node head;
    public SinglyLinkedList(Node head)
    {
        this.head = head;
    }
    
    //---------------add values in linked list
    public void add(Node node)
    {
        Node current = head;
        while (current != null)
        {
            if (current.next == null)
            {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    //----------print a singly linked list
    public void print()
    {
        Node node = head;
        while (node != null)
        {
            System.out.print(node.data() + " ");
            node = node.next();
        }
        System.out.println("");
    }
    //---------reverse a linked list without recursion
    public void reverse()
    {
        Node pointer = head;
        Node previous = null, current = null;
        while (pointer != null)
        {
            current = pointer;
            pointer = pointer.next;
            // reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }
    }
}
