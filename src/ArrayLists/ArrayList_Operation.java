package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

class Different_Operation {


    public static void insert(ArrayList al)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert values in the ArrayList:");
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        System.out.println(al);
    }
    public static void delete(ArrayList al)
    {
        System.out.println("Enter the number that you wanna to remove:");
        Scanner sc = new Scanner(System.in);
        al.remove(sc.nextInt());
    }
     public static void update(ArrayList al)
    {
        System.out.println("Enter the index and number that you to update to remove:");
        Scanner sc = new Scanner(System.in);
        al.set(sc.nextInt(),sc.nextInt());
    }
}
public class ArrayList_Operation
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Different_Operation obj = new Different_Operation();
        obj.insert(al);
        obj.delete(al);
    }
}
