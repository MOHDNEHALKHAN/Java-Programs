//Program to find the area of a circle using constructor

class Program8 {
    double area, r, pi;

    Program8(double R) { // constructor
        r = R;
    }

    void area() {
        pi = 3.14;
        area = pi * r * r;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Program8 r1 = new Program8(4); // constructor is called when an object of a class is created
        System.out.println("Area of circle is:");
        r1.area();
    }
}