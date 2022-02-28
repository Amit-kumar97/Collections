package Stack;


/*
Checking A String ,is Palindrome or Not using Stack
 */
public class PalindromeString {
    //---------Node class Structure
    class Node
    {
        char ch;
        Node next;
        //-------constructor
        public Node(char ch)
        {
            this.ch = ch;
            next = null;
        }
    }          //----------End of Node Class

    Node top;
    //----------constructor
    public PalindromeString()
    {
        top = null;
    }

    //----------method used check weather the stack is empty or not
    public boolean isEmpty()
    {
        if (top==null)
            return true;
        else
            return false;
    }

    //----------insert string values individually
    public void push(char ch)
    {
        Node newnode = new Node(ch);

        newnode.next = top;
        top = newnode;
    }

    //---------used to pop out individual elements
    public char pop()
    {
        if (isEmpty())
            return '0';
        else
        {
            char deleted = top.ch;
            top = top.next;
            return deleted;
        }
    }
}
class PalindromSringExecute
{
    public static void main(String[] args) {
        String str = "radar";
        int size = str.length();

        PalindromeString obj = new PalindromeString();

        for (int i=0; i<size; i++) {
            char ch = str.charAt(i);
            obj.push(ch);
        }
        int c = 0;
        if (isPalindrom(c,size,str,obj)==size)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static int isPalindrom(int c, int size,String str,PalindromeString obj)
    {
        c = 0;
        for (int i=0; i<size; i++) {
            if (obj.pop()==str.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}
