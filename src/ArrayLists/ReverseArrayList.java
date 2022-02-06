package ArrayLists;

import java.util.*;
/*
Write a Java program to reverse elements in a array list.
*/
public class ReverseArrayList {

    public static void main(String[] args) {

        //--------------Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reversing :\n" + list_Strings);

        Collections.reverse(list_Strings);                 //-----------method for reversing the ArrayList
        System.out.println("List after reversing :\n" + list_Strings);
    }
}
