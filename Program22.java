//Program using interface , the function which is declare we cannot create the body of the function inside the interface

interface hello{ //interface by the name of hello
    public void ab(); //function ab & we cannot create the body of the function inside the interface
} 
interface world{
    public void c();
}
public class Program22 implements hello,world{
    public void ab(){ // body of the function ab defined here
        System.out.println("Good Morning");
    }
    public void c(){
        System.out.println("Good Evening");
    }
    public static void main(String[] args) {
        Program22 b1 = new Program22();
        b1.c(); // calling a method c which is declared in the interface world
    }
}