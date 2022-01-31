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
}
