import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note : Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 50
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5
Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/
//====================WE ADDED A MORE CONCEPT OF LIST INSERTION OF NEWNODE AT THE LAST OF PREVIOUS NODE============//

//------------NODE CLASS STRUCTURE
class Node
{
    //----------VARIABLE DECLARATION
    int data1, data2, data3;
    Node next;
    //-------CONSTRUCTOR
    public Node(int data1,int data2,int data3)
    {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        next = null;
    }
}

public class TripletSum_With_LinkedList {

    static Node head;
    //---------CONSTRUCTOR
    public TripletSum()
    {
        head = null;
    }
    
    //---------TO INSERT VALUES IN THE LINKED LIST
    public static void push(int data1,int data2,int data3)
    {
        Node newnode = new Node(data1,data2,data3);
        if (head==null)
        {
            newnode.next = head;
            head = newnode;
        }
        else
        {
            Node temp = head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    //-------------FIND THE ALL SETS OF TRIPLET PAIR
    public static void triplet_equal_sum(int ar[], int x)
    {
        int count = 0;
        for (int i=0; i<ar.length-2; i++) {
            for (int j=i+1; j<ar.length-1; j++) {
                for (int k=j+1; k<ar.length; k++) {
                    if (ar[i]+ar[j]+ar[k]==x)
                    {
                        push(ar[i],ar[j],ar[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Number of Triplet Sum Sets: "+count);
    }

    //--------------TO DISPLAY ALL THE VALUES
    public static void display()
    {
        if (head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node temp = head;
            System.out.println("List of All Triplet Sets:");
            while (temp!=null)
            {
                System.out.println(temp.data1+" "+ temp.data2+" "+ temp.data3);
                temp = temp.next;
            }
        }
    }

    //----------------MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Test Cases:");
        int t = sc.nextInt();
        while (t!=0)
        {
            System.out.println("Enter the size of Array:");
            int size = sc.nextInt();
            int ar[] = new int[size];
            System.out.println("Enter the Elements of Array:");
            for (int i=0; i< ar.length; i++)
            {
                ar[i] = sc.nextInt();
            }
            System.out.println("Enter the Integer 'X':");
            int x = sc.nextInt();
            triplet_equal_sum(ar,x);
            t--;
        }
        display();
    }
}
