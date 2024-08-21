//Program  to modify a string

public class Program28{
    public static void main(String[] args){
        StringBuffer Sb = new StringBuffer("This is a test"); 
        Sb.replace(5,7,"was"); // replacing the substring "is" with "was"
        System.out.println(Sb);
    }
}