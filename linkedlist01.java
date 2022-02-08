package LinkedLists;

//----------Node class with Generics
class Node<T>
{
    T data;
    Node<T> next;
    //--------Constructor

    Node(T data)
    {
        this.data = data;
    }
}
//----------definition class
public class linkedlist01
{
    //--------method to print the Node values
    public static void print(Node<Integer> head)
    {
        Node<Integer> temp = head;              //---------creating a temporary Node to hold reference of head

        while(temp!=null)                       //---------it will print the values until head.next is not equals to null
        {                                       //---------if condition gets fail than it will come out from the loop
            System.out.print(temp.data+" ");
            temp = temp.next;                    //---------move head next to their corresponding Node
        }
        System.out.println();
    }
    //----------main method in which we initialises the Linked List
    public static void main(String[] args) {

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        node1.next = node2;                                 //-----------passing the reference of 2nd Node to their previous one
        node2.next = node3;
        print(node1);
    }
}
