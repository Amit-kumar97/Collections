package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

class Different_Operation {
    public static void insert(ArrayList al)
    {
        System.out.println("Insert values in the ArrayList:");
        Scanner sc = new Scanner(System.in);
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        System.out.println(al);
    }
}
public class ArrayList_Operation
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Different_Operation obj = new Different_Operation();
        obj.insert(al);
    }
}