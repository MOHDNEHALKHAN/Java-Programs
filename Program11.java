//Program to demonstrate the use of various string functions in Java
public class Program11 {
    public static void main(String[] args) {
        String str = "Manipal University , Jaipur";
        int len = str.length();

        System.out.println("The length of the text string is " + len);

        System.out.println("-------------");
        System.out.println(str.toLowerCase());

        System.out.println("-------");
        System.out.println(str.indexOf('U'));

        System.out.println("--------");
        String Name1 = "Jaipur";
        String Name2 = "university";
        System.out.println(Name1 + " " + Name2);

        System.out.println("-----------");
        System.out.println(Name1.concat(Name2));

        System.out.println("------");
        String Str1 = "Manipal University , Jaipur";
        Str1 = Str1.trim();
        System.out.println(Str1);
        System.out.println("-");

        String Str2 = "It is car";
        String replace = Str2.replace('c', 'J'); // replaces all occurrences of 'c' to 'J'
        System.out.println(replace);

        System.out.println("-----");
        replace = Str2.replace("Car", "good"); // replaces all occurrences of "Car" to "good"
        System.out.println(replace);

        System.out.println("----------");
        String S1 = "Car";
        String S2 = "car";
        String S3 = new String("Good");
        String S4 = "Jar";

        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S4));

        System.out.println("----------");

        S1 = "CAR";
        S2 = "car";
        System.out.println(S1.equals(S2));
        System.out.println(S1.equalsIgnoreCase(S2));

        System.out.println("-----------");
        str = "Manipal University, Jaipur";
        int index = str.indexOf('P');
        System.out.println("Index of the letter 'P': " + index);

        int firstIndex = str.indexOf("Uni");
        System.out.println("First occurrence of 'Uni' is found at: " + firstIndex);
    }
}