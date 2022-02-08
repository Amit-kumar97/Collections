
//---------Node class structure of Singly linked list
class Node
{
    int data;                        //-------------to hold the value of Node
    Node next;                       //-------------self referential structure
    //--------constructor   (Optional)
    Node(int data)
    {
        this.data = data;
    }
}
//-----------definition class-Providing the defination of all the methods
public class LinkedList02 {
    
    //----------method to create Node and initialises with values
    public static Node createlinkedlist()
    {
        //---------add values by creating node class object
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;                           //---------passing the reference of next node to their previous one
        n2.next = n3;
        n3.next = n4;
        return n1;                              //---------since method has return type so we need to return some value
    }
    //----------method to print values of node
    public static void display()
    {
        Node temp = createlinkedlist();
        //---------manually printing the values by taking reference of next node
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.next.next.data);

    }
}
//---------execution class
class linkedlist02test
{
    public static void main(String[] args) {
        
        LinkedList02 obj = new LinkedList02();
        obj.createlinkedlist();
        obj.display();
    }
}
