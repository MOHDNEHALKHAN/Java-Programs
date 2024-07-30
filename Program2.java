//Program using a constructor function
class Program2 {
    int x;

    Program2() { // constructor function
        x = 9;
    }

    public static void main(String[] args) {
        Program2 a1 = new Program2(); // creating an object of class Program2, i.e., a1
        System.out.println(a1.x);
    }
}
