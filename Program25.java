//Program to convert byte array to string

public class Program25{
    public static void main(String[] args){
        byte asc[] = {65,66,67,68,69,70,}; // array of numbers with data type byte
String str1 = new String(asc); // converting byte array to string
System.out.println(str1); 
String str2 = new String(asc,2,3); // converting byte array to string with offset 2 and length 3
System.out.println(str2);
}
}