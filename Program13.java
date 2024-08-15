// Write a program to demonstrate code reusability by using inheritance
class Business {
    float ItemCost = 500;
    float Turnover = 0;
}

class Program13 extends Business {
    float Turnover = 1000000;

    public static void main(String args[]) {
        Program13 o = new Program13();
        System.out.println("Cost of item is: " + o.ItemCost);
        System.out.println("Turnover is: " + o.Turnover);
    }
}