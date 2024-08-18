//Constructor function using parameterized constructor

class aa{
    int x,y;
    public aa(int x2 , int y2)
    {
        x = x2;
        y = y2;
    }
}
public class Program19 {
    public static void main(String[] args) {
        int x1 = 10 , y1 = 20;
        aa a1 = new aa(x1,y1);
        System.out.println(a1.x);
        System.out.println(a1.y);
    }
}