package ArrayLists;

import java.util.ArrayList;
/*
Write a Java program to clone an array list to another array list.
 */

public class CloneArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> original = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.err.println("Original array list: " + original);

        ArrayList<String> newclone = (ArrayList<String>)original.clone();                //-----------CLONING ORINGINAL ARRAYLIST
        System.out.println("Cloned array list: " + newclone);
    }
}
