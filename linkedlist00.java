import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList00 {
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

        //----------Get and set Items in the list
        Object firstvar = l_list.get(0);
        System.out.println("First Item: " +firstvar);
        l_list.set(0, "America");
        System.out.println("L_List Content after updating first Item: " +l_list);

        //----------Remove from a position
        l_list.remove(1);
        l_list.remove(2);
        System.out.println("LinkedList after deletion of Item in 2nd and 3rd position " +l_list);

        //----------Remove first and last Item
        l_list.removeFirst();
        l_list.removeLast();
        System.out.println("Final Content after removing first and last Item: "+l_list);

        //----------Iterating the linked list using Iterator
        ListIterator<String> itrator = l_list.listIterator();
        System.out.println("List displayed using iterator:");
        while (itrator.hasNext()) 
        {
            System.out.println(itrator.next());
        }
    }
}
