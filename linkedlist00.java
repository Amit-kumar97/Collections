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
     
      //---------Add Items at specified position
        l_list.add(2, "Russia");
        l_list.add(3, "Phillipins");
        System.out.println("L_List Content after Addition at specific index: " +l_list);

        //---------Add First and Last Item
        l_list.addFirst("First Country");
        l_list.addLast("Last Country");
        System.out.println("L_List Content after addition at first and last: " +l_list);
    }
}
