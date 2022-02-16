package Queue;

class Node
{
    int data;
    int priority;
    Node next;
    public Node(int data,int priority)
    {
        this.data = data;
        this.priority = priority;
        next = null;
    }
}
public class PriorityQueueWithLinkedList {
    Node front;
    Node rear;
    public PriorityQueueWithLinkedList()
    {
        front = rear = null;
    }

    public void enqueue(Node newnode)
    {
        if (front==null || newnode.priority < front.priority)
        {
            newnode.next = front;
            front = newnode;
        }
        else
        {
            Node temp = front;
            while (temp!=null && temp.next.priority<= newnode.priority)
            {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void display()
    {
        Node temp = front;
        System.out.println("Data and priority in a LinkList:");
        while (temp!=null)
        {
            System.out.println(temp.data+" "+temp.priority);
            temp = temp.next;
        }
    }
}
class PriorityQueueWithLinkedList_Test
{
    public static void main(String[] args) {
        Node n1 = new Node(15,4);
        Node n2 = new Node(10,3);
        Node n3 = new Node(20,3);
        Node n4 = new Node(40,2);
     //   Node n5 = new Node(50,5);
        PriorityQueueWithLinkedList obj = new PriorityQueueWithLinkedList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
     //   obj.enqueue(n5);
        obj.display();
    }
}
