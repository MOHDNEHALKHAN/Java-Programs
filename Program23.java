//Program using inheritance

class a{
 public void ab(){ // method of class a
     System.out.println("Hello");
 }
}
class b extends a{ // class b extends class a
 public void aa(){ // method of class b
     System.out.println("hello Manipal");
 }
}
class c extends b{ // class c extends class b
 public void cc(){ // method of class c
     System.out.println("Hello Manipal University Jaipur");
 }
}
public class Program23{
 public static void main(String[] args) {
     c c1 = new c(); // object of class c
     c1.ab(); // calling method ab of class a
     c1.aa(); // calling method aa of class b
     c1.cc(); // calling method cc of class c
 }
}