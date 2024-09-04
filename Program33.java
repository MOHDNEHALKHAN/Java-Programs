//Program  for a thread using runnable interface

class M implements Runnable{
    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class Program33{
    public static void main(String[] args){
        int n = 8;
        for(int i=0;i<n;i++){
            Thread object = new Thread(new M());
            object.start();
        }
    }
}