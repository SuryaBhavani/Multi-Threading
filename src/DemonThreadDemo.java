//Daemon thread is the lowest priority thread
public class DemonThreadDemo implements Runnable {
    public void run(){
        System.out.println("Daemon thread demo ");
    }
    public static void main(String[]args){
        DemonThreadDemo dt=new DemonThreadDemo();
        Thread t1=new Thread(dt);
        t1.setDaemon(true);


        t1.start();
        System.out.println(t1.isDaemon());

    }
}
