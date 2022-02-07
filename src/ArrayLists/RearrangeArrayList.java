package ArrayLists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Print an array that contains the exact same number as the given array, but rearrange
so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
 */

public class RearrangeArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of ArrayList:");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();                  //---------CREATING ONJECT OF ARRAYLIST CLASS
        while (size!=0)                           //---------TAKING INPUT FROM THE USER UNTIL CONDITION SATISFIED                           //---------IT WILL TAKE INPUT FROM THE USER UNTIL THE GETS FULLFILLE
        {                                                                    //---------IF CONDITION GETS FAIL THEN IT WILL COME OUT FROM WHILE LOOP
            list.add(sc.nextInt());
            size--;                   //-----------DECREASING THE SIZE AFTER EACH ITERATION
        }

        ArrayList<Integer> newlisteven = new ArrayList<Integer>();               //-------NEW LIST OBJECT FOR STORING EVEN NUMBERS
        ArrayList<Integer> newlist = new ArrayList<>();                          //-------ANOTHER NEWLIST OBJECT FOR STORING NON-EVEN NUMBERS

        for (int i=0; i< list.size(); i++)
        {
            if (list.get(i)%2==0)                            //-------CHECK CONDITION FOR EVEN VALUES IN ORIGINAL LIST
            {
                newlisteven.add(list.get(i));                //-------IF CONDITION SATISFIES THAN IT STORS IN NEW LIST
            }
        }
        //------------SIMILARLY CHECKONG FOR NON-EVEN VALUES
        for (int i=0; i< list.size(); i++)
        {
            if (list.get(i)%2!=0)
            {
                newlist.add(list.get(i));
            }
        }
        newlisteven.addAll(newlist);              // -----------CONCATINATE TWO LISTS
        System.err.println("Original list:"+list);                 //------------PRINTING ORIGINAL LIST
        System.err.println("Rearranged List:"+newlisteven);          //------------PRINTING NEW REARRANGED LIST
    }

}
