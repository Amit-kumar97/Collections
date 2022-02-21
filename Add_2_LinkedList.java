package LinkedLists;

// A Java recursive program to add two linked lists

public class Add_2_LinkedList {

    class Node
    {
        int val;
        Node next;
        public Node(int val)
        {
            this.val = val;
        }
    }
    void printlist(Node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    Node head1, head2, result;
    int carry;

    public void push(int val, int list)
    {
        Node newnode = new Node(val);
        if (list == 1)
        {
            newnode.next = head1;
            head1 = newnode;
        }
        else if (list == 2)
        {
            newnode.next = head2;
            head2 = newnode;
        }
        else
        {
            newnode.next = result;
            result = newnode;
        }
    }

    public void addsamesize(Node n, Node m)
    {
        if (n == null)
            return;

        addsamesize(n.next, m.next);

        int sum = n.val + m.val + carry;
        carry = sum / 10;
        sum = sum % 10;

        push(sum, 3);
    }
    Node cur;
    public void propogatecarry(Node head1)
    {
        if (head1 != cur)
        {
            propogatecarry(head1.next);
            int sum = carry + head1.val;
            carry = sum / 10;
            sum %= 10;

            push(sum, 3);
        }
    }

    public int getsize(Node head)
    {
        int count = 0;
        while (head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    public void addlists()
    {
        if (head1 == null)
        {
            result = head2;
            return;
        }

        if (head2 == null)
        {
            result = head1;
            return;
        }

        int size1 = getsize(head1);
        int size2 = getsize(head2);

        if (size1 == size2)
        {
            addsamesize(head1, head2);
        }
        else
        {
            if (size1 < size2)
            {
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }
            int diff = Math.abs(size1 - size2);

            Node temp = head1;
            while (diff-- >= 0)
            {
                cur = temp;
                temp = temp.next;
            }

            addsamesize(cur, head2);
            propogatecarry(head1);
        }
        if (carry > 0)
            push(carry, 3);

    }

    public static void main(String args[])
    {
        Add_2_LinkedList list = new Add_2_LinkedList();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };

        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);

        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);

        list.addlists();

        list.printlist(list.result);
    }
}
