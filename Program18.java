//constructor function use to initialize the object of the clas & name of class will be same as name of the constructor function

class aa
{
    int x;
    aa() // simple constructor function
    {
        x = 10;
    }
}
public class Program18 {
    public static void main(String[] args) {
        aa a1 = new aa();
        System.out.println(a1.x);
    }

}