// Program using the Collection class with stack

import java.util.Iterator;
import java.util.Stack;

public class Program31{
    public static void main(String[] args){
        
        Stack<String> stack = new Stack<String>(); // creating a stack
        stack.push("Ravi"); // adding elements to the stack
        stack.push("Kishan");
        stack.push("good");
        stack.push("Bad");
        stack.push("Heaven");
        stack.pop(); // removing the top element
        Iterator<String> itr = stack.iterator(); {
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
}