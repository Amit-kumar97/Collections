package LinkedLists;

//----------Program to Split a Circular Linked List into two parts

public class SplitCircularLinkedList {
    
    static class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            next = null;
            next = null;
        }
    }
    
    static Node head, head1, head2;
    
    public static void splitList()
    {
        Node oddNode = head;
        Node evenNode = head;

        if(head==null)
        {
            System.out.println("Underflow");
        }
        else
        {
            while (evenNode.next!=head && evenNode.next.next!=head)
            {
                evenNode = evenNode.next.next;
                oddNode = oddNode.next;
            }
            if (evenNode.next.next == head)
            {
                evenNode = evenNode.next;
            }
            head1 = head;
            if (head.next!=head)
            {
                head2 = oddNode.next;
            }
            evenNode.next = oddNode.next;
            oddNode.next = head;
        }
    }

    public static void print(Node newnode)
    {
        Node temp = newnode;
        if (newnode!=null);
        {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            while (temp!=newnode);
        }
    }

    
    public static void main(String args[])
    {
        SplitCircularLinkedList list = new SplitCircularLinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = list.head;

        System.out.println("Original Circular LinkedList");
        list.print(head);

        //-----------split list
        list.splitList();
        
        System.out.println("");
        System.out.println("First Circular List");
        list.print(head1);
        
        System.out.println("");
        System.out.println("Second Circular List");
        list.print(head2);
    }
}
