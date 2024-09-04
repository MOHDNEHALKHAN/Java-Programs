// Program using the Collection class with hash stack

import java.util.Iterator;
import java.util.HashSet;

public class Program32{
    public static void main(String[] args){
        HashSet<String> Set = new HashSet<String>(); // creating a Hash Set
        Set.add("Ravi"); // adding elements to the Hash Set
        Set.add("Kishan");
        Set.add("good");
        Set.add("Bad");
        Iterator<String> itr = Set.iterator(); 
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
    }
}