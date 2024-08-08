public class Program6 {
    public static void main(String[] args) {

        // Bitwise AND(&)
        int x = 4, y = 5;
        System.out.println("x & y = " + (x & y));
        System.out.println("-------------");

        // Bitwise inclusive operator(|)
        System.out.println("x | y = " + (x | y));
        System.out.println("-------------");

        // Bitwise exclusive operator(^)
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("-------------");

        // Bitwise complement operator(~)
        int c = 5;
        System.out.println("~c = " + (~c));
        System.out.println("-------------");

        // Bitwise Right Shift operator(>>)
        int z = 4;
        System.out.println("Bitwise right shift operator z >> 1 = " + (z >> 1));
        System.out.println("-------------");

        // Bitwise Left Shift operator(<<)
        System.out.println("Bitwise left shift operator z << 1 = " + (z << 1));
        System.out.println("-------------");
    }
}