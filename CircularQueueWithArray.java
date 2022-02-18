package Queue;
//=========================Implementation of Circular Queue with Array=====================//

//------------Definition  class
public class CircularQueueWithArray {
    int ar[];
    int size;
    int beginning;
    int top;
    //---------------constructor
    public CircularQueueWithArray(int size)
    {
        ar = new int[size];
        this.size = size;
        beginning = top = -1;
    }
    //-----------checking array is empty or not
    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //-------------checking array is full or not
    public boolean isFull()
    {
        if (top+1 == beginning)
        {
            return true;
        }
        else if ((beginning == 0) && (top+1 == size))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //--------------inserting values
    public void enqueue(int val)
    {
        System.out.println("=============Enqueue Operation============");
        if (isFull())
        {
            System.out.println("Overflow");
        }
        else if(isEmpty())
        {
            beginning = 0;
            top++;
            ar[beginning] = val;
        }
        else
        {
            if(top+1 == size)
            {
                top = 0;
            }
            else
            {
                top++;
            }
            ar[top] = val;
        }
    }
    //----------------deleting values
    public void dequeue()
    {
        System.out.println("=============Dequeue Operation============");
        if(isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println(ar[beginning]);
            if (beginning == top)
            {
                beginning = top = -1;
            }
            else if(beginning+1 == size)
            {
                beginning = 0;
            }
            else
            {
                beginning++;
            }
        }
    }
    //-----------------traversing Array for printing the values
    public void traverse()
    {
        System.out.println("===============Traversal Operation============");
        for (int i=0; i<size; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
//-----------------execution class
class circularqueuemain
{
    public static void main(String[] args) {
        CircularQueueWithArray obj = new CircularQueueWithArray(3);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.traverse();

        //-------------Dequeue------------
        obj.dequeue();
        obj.traverse();

        obj.enqueue(40);
        System.out.println("==============");
        obj.traverse();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(100);
        obj.enqueue(200);
        obj.enqueue(300);
        System.out.println("==============");
        obj.traverse();

    }
}
