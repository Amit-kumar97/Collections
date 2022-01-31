package LinkedLists;

class Node<T>
{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data = data;
    }
}
public class linkedlist01 
{
    public static void print(Node<Integer> head)
    {
        Node<Integer> temp = head;

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next = node2;
        print(node1);
    }
}
