package LinkedLists;


public class Stack_with_DoublyLinkedlist {
    static class Node
    {
        int data;
        Node next;
        Node previous;
        //--------Constructor
        Node()
        {
            this.data = data;
        }
    }

    Node top;

    //-----------METHOD TO INSERT VALUES IN THE STACK with doubly linked list
    public  void push(int data)
    {
        Node newnode = new Node();
        newnode.data = data;                //---------ASSIGNING VALUES TO THE NEW NODE
        newnode.next = top;                 //---------IT HELPS TO JOIN NEW NODE TO EXISTING NODE
        newnode.previous = null;
        top = newnode;                      //---------UPDATE TOP REFERENCE
    }

    //------------METHOD FOR DELETION OPERATION FROM THE STACK
    public void pop()
    {
        if (top==null)
        {
            System.out.println("Empty");
        }
        else
        {
            top = top.next;
            top.previous = null;
        }
    }

    //------------METHOD FOR DISPLAYING VALUES OF STACK FROM TOP
    public void display()
    {
        //-------------CHECKING IF TOP IS NULL OR NOT
        if (top==null)
        {
            System.out.println("empty");
            return;
        }
        else
        {
            Node temp = top;
            while (temp!=null)                         //------------SPECIFYING A CONDITION TO PRINT ALL VALUES
            {
                System.out.println(temp.data);
                temp = temp.next;                       //------------M0VING TOP TO NEXT OF THE TOP
            }

        }
    }

    //------------METHOD TO FIND TOP OF STACK IN LINKED LIST
    public  void peek()
    {
        if (top==null)
        {
            System.out.println("No value in Linked List");
        }
        else
        {
            System.out.println(top.data);
        }
    }
}
class stackdoublylinkedlist_test
{
    public static void main(String[] args) {

        Stack_with_DoublyLinkedlist obj= new Stack_with_DoublyLinkedlist();
        //-------------INSERT VALUES FROM THE TOP OF THE STACK
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.out.println("Top of Stack in Linked List:");
        obj.peek();

        System.out.println("Values in Stack:");
        obj.display();

        obj.pop();                      //---------DELETE ELEMENTS FROM THE TOP [LIKE...1st 30 ,20.....and so on]

        System.out.println("Top of Stack in Linked List After performing pop operation:");
        obj.peek();

        System.out.println("Stack values After Deleting some values.");
        obj.display();                   //--------AGAIN DISPLAY AFTER DELETING VALUES FROM STACK
    }
}
