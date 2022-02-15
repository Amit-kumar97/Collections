package LinkedLists;
//----------------Double Ended Queue with Linked List
import java.util.Scanner;

//--------------Node class Structure with generics
class Node05<T>
{
    T data;
    Node05 next;
    Node05 prev;
    public Node05(T data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
}
//-----------Definition class
public class Double_Ended_Queue {
    Node05 front;
    Node05 rear;
    //-------------to check queue is empty or not
    public boolean isEmpty()
    {
        return (rear == null && front == null);
    }

    //----------insert values from the front
    public void enqueue_from_Starting(String data)
    {
        Node05<String> newnode = new Node05<String>(data);
        if(isEmpty())
        {
            rear = front = newnode;
        }
        else
        {
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
        }
    }

    //-------------insert values from the rear
    public void enqueue_from_last(String data)
    {
        Node05<String> newnode = new Node05<String>(data);
        if (isEmpty())
        {
            front = rear = newnode;
        }
        else
        {
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }
    }

    //-----------deleting values from the front
    public void dequeue_from_starting()
    {
        if (isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(front.data);
            front = front.next;

            //---------------checking if there is only one element is there
            if(front==null)
            {
                rear = null;
            }
            else
            {
                front.prev = null;
            }
        }
    }

    //--------------deleting values from the rear
    public void dequeue_from_last()
    {
        if (isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(rear.data);
            rear = rear.prev;

            //---------------checking if there is only one element is there
            if(rear==null)
            {
                front = null;
            }
            else
            {
                rear.next = null;
            }
        }
    }

    //---------------delete all the values of queue and became null
    public void delete_all()
    {
        while (front!=null)
        {
            front = front.next;
        }
        System.out.println("Queue is null");
    }
}
//---------------Execution class
class deque_test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double_Ended_Queue obj = new Double_Ended_Queue();
        System.out.println("Enter some size:");
        int size = sc.nextInt();
        System.out.println("Enter the values of String Type:");
        while(size!=0)
        {
            String str = sc.next();
            obj.enqueue_from_Starting(str);
            size--;
        }
        System.out.println("Retrieve values from the stating:");
        obj.dequeue_from_starting();
        obj.dequeue_from_starting();
        obj.delete_all();
        obj.enqueue_from_last("GLA");
        obj.enqueue_from_last("Kabir");
        System.out.println("Retrieve values from the stating:");
        obj.dequeue_from_last();
        obj.dequeue_from_last();
    }
}
