import java.util.Scanner;


//------------Queue with Array
public class Queue_with_Array {
    int ar[];
    int front;
    int rear;
    public Queue_with_Array(int size)
    {
        ar = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isempty()
    {
        if (front==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isfull()
    {
        if(rear==ar.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void enqueue(int val)
    {
        if (isfull())
        {
            System.out.println("Array is full");
        }
        else if(isempty())
        {
            front = 0;
            rear = rear+1;
            ar[rear] = val;
        }
        else
        {
            rear++;
            ar[rear] = val;
        }
    }
    public void dequeue()
    {
        if (isempty())
        {
            System.out.println("Array is Empty");
        }
        else
        {
            System.out.println(ar[front]);
            front++;
        }
        if ( front==rear)
        {
            front = rear = -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        Queue_with_Array obj = new Queue_with_Array(size);
        int val;
        while (size!=0)
        {
            val = sc.nextInt();
            obj.enqueue(val);
            size--;
        }

        obj.dequeue();
        obj.dequeue();
    }
}
