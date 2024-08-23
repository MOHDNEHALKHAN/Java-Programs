// Program using the Collection class with LinkedList

import java.util.Iterator;
import java.util.LinkedList;

public class Program29{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>(); // creating a linked list
        list.add("Ravi"); // adding elements to the linked list
        list.add("Kishan");
        list.add("good");
        list.add("Bad");
        list.add("Heaven");
        Iterator<String> itr = list.iterator(); {
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
}