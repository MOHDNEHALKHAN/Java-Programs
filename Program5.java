class Program5 {
    public static void main(String[] args) {
        // Java arithmetic operators
        // Declare variables
        int a = 100, b = 10;

        // Addition operator
        System.out.println("a + b = " + (a + b));
        // Subtraction operator
        System.out.println("a - b = " + (a - b));
        // Multiplication operator
        System.out.println("a * b = " + (a * b));
        // Division operator
        System.out.println("a / b = " + (a / b));
        // Modulo operator
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        // Create variables
        int x = 4;
        int var;

        // Assign value using =
        var = x;
        System.out.println("var using =: " + var);
        // Assign value using +=
        var += x; // var = var + x
        System.out.println("var using +=: " + var);
        // Assign value using *=
        var *= x; // var = var * x
        System.out.println("var using *=: " + var);

        // Relational Operators
        // Create variables
        int a1 = 7, b1 = 11;
        // Value of a1 and b1
        System.out.println("a1 is " + a1 + " and b1 is " + b1);
        // == operator
        System.out.println(a1 == b1); // false
        // != operator
        System.out.println(a1 != b1); // true
        // > operator
        System.out.println(a1 > b1); // false
        // < operator
        System.out.println(a1 < b1); // true
        // >= operator
        System.out.println(a1 >= b1); // false
        // <= operator
        System.out.println(a1 <= b1); // true

        // Logical Operators
        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false
        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println(5 > 3); // true
        System.out.println((5 < 3) || (8 < 5)); // false
        // ! operator
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false

        // Unary Operators
        // Declare variables
        int m = 12, n = 12;
        int result1, result2;
        // Original value
        System.out.println("Value of m: " + m);
        // Increment operator
        result1 = ++m;
        System.out.println("After increment: " + result1);
        System.out.println("Value of n: " + n);
        // Decrement operator
        result2 = --n;
        System.out.println("After decrement: " + result2);

        // Ternary Operator
        int Z = 81;
        String result;
        // Ternary operator
        result = (Z == 80) ? "Even" : "Odd";
        System.out.println(result);
    }
}
