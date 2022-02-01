import java.util.LinkedList;
import java.util.ListIterator;
 
public class linkedlist {
    public static void main(String args[]) {
 
     //---------Linked List Declaration
     LinkedList<String> l_list = new LinkedList<String>();
     //-----add(String Item) is used for adding the Items to the linked list
        l_list.add("India");
        l_list.add("Japan");
        l_list.add("China");
        l_list.add("South Korea");
      System.out.println("Linked List Content: " +l_list);
    }
}
