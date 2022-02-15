package LinkedLists;

//-----------------Implementation of Queue with Linked List

import java.util.Scanner;

//----------node class Structure
class Node04
{
    int data;
    Node04 next;
    public Node04(int data)
    {
        this.data = data;
        next = null;
    }
}
//----------definition class
public class Queue_with_LinkedList {
    Node04 front;
    Node04 rear;
    
    //----------to check queue is empty or not
    public boolean isEmpty()
    {
        return (rear == null && front == null);
    }
    //---------enqueue operation
    public void enqueue(int data)
    {
        Node04 newnode = new Node04(data);
        if (isEmpty())
        {
            front = rear = newnode;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;                              //----rear = rear.next
        }
    }
    //----------dequeue Operation
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(front.data);
            front = front.next;
        }
    }
}
//----------Execution class
class queuewithlinkedlist_test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue:");
        int n = sc.nextInt();
        Queue_with_LinkedList obj = new Queue_with_LinkedList();
        System.out.println("Enter the values in the queue:");
        while(n!=0)
        {
            int data = sc.nextInt();
            obj.enqueue(data);
            n--;
        }
        System.out.println("Queue is Empty: "+obj.isEmpty());
        System.out.println("Values in the Queue:");
        while (obj.front!=null)
        {
            obj.dequeue();
        }
    }
}
