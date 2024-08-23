// Program using the Collection class with ArrayList

import java.util.Iterator;
import java.util.ArrayList;

public class Program30{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>(); // creating an array list
        list.add("Ravi"); // adding elements to the array list
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