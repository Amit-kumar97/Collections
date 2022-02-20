package Stack;

import java.util.*;

public class StackDemo_Predefine {

    //-------------Main Method
    public static void main(String[] args) {

        //------------Default initialization of Stack
        Stack stack1 = new Stack();

        //------------Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();

        //---------pushing the elements
        stack1.push(4);
        stack1.push("My");
        stack1.push("University");
        stack1.push("GLA");

        stack2.push("DSA");
        stack2.push("With");
        stack2.push("Stack");
        stack2.push("and");
        stack2.push("Using Predefined Library.");

        //------------Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
