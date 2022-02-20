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
        
        Stack<Integer> stack = new Stack<Integer>();
 
        //------------add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);
 
        //--------------Displaying the Stack
        System.out.println("Initial Stack: " + stack);
 
        //--------------Removing elements using pop() method
        System.out.println("Popped element: "+ stack.pop());
        System.out.println("Popped element: "+ stack.pop());

        //------------Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
        
        //-----------Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "+ stack);
    }
}
