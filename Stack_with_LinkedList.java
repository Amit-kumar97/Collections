package LinkedLists;


public class Stack_with_LinkedList {

    public class Node
    {
        int data;
        Node next;
        //---------- Constructor
        Node()
        {
            this.data = data;
            next = null;
        }
    }

    Node top;
    Stack_with_LinkedList()
    {
        top = null;
    }
    //-----------METHOD TO INSERT VALUES IN THE STACK
    public void push(int data)
    {
        //----------CREATING A NEW NODE SO THAT IT ALLOCATE MEMORY
        Node newnode = new Node();

        newnode.data = data;                //---------ASSIGNING VALUES TO THE NEW NODE
        newnode.next = top;                 //---------IT HELPS TO NEW NODE TO EXISTING NODE
        top = newnode;                      //---------UPDATE TOP REFERENCE
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
    //------------METHOD FOR DELETION OPERATION FROM THE STACK
    public void pop()
    {
        //--------------CHECKING IF TOP IS NULL OR NOT
        if (top==null)
        {
            System.err.println("Empty List.");
            return;
        }
        else
        {
            top = top.next;               //---------ASSIGNING TOP TO NEXT OF TOP
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
class stackwithlinkedtest
{
    public static void main(String[] args) {

        Stack_with_LinkedList obj = new Stack_with_LinkedList();

        //-------------INSERT VALUES FROM THE TOP OF THE STACK
        obj.push(10);
        obj.push(20);
        obj.push(30);

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
