// Java program for objects passing to methods

// Creating a class
class ObjectPass {
    int a, b;

    // Constructor
    ObjectPass(int i, int j) {
        a = i;
        b = j;
    }

    // Method to compare two objects
    boolean equalTo(ObjectPass obj) {
        // Returns true if obj is equal to the invoking object
        return (obj.a == a && obj.b == b);
    }
}

// Main class
public class Program9 {
    public static void main(String[] args) {
        // Creating objects
        ObjectPass obj1 = new ObjectPass(11, 22);
        ObjectPass obj2 = new ObjectPass(11, 22);
        ObjectPass obj3 = new ObjectPass(10, 12);

        // Checking whether objects are equal with different values or not
        System.out.println("obj1 == obj2: " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3: " + obj1.equalTo(obj3));
    }
}