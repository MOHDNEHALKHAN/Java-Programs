// Write a program to show String handling (character extraction & String Comparison).

public class Program10 {

    public static void main(String[] args) {
        String str = "the focus on holistic education";

        // Character Extraction
        char ch[] = new char[4];
        str.getChars(4, 7, ch, 0);
        System.out.println(ch);

        // String Comparison
        String string1 = new String("The");
        String string2 = new String("focus");
        String string3 = new String("holistic");
        String string4 = new String("education");
        String string5 = new String("Education");

        // Comparing string1 and string2
        System.out.println("Compare " + string1 + " and " + string2 + ": " + string1.equalsIgnoreCase(string2));

        // Comparing string3 and string4
        System.out.println("Compare " + string3 + " and " + string4 + ": " + string3.equalsIgnoreCase(string4));

        // Comparing string1 and string4
        System.out.println("Compare " + string1 + " and " + string4 + ": " + string1.equalsIgnoreCase(string4));

        // Comparing string4 and string5
        System.out.println("Compare " + string4 + " and " + string5 + ": " + string4.equalsIgnoreCase(string5));
    }
}