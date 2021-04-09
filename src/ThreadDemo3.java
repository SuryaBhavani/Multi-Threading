//A method to find which thread is running currently
public class ThreadDemo3 implements Runnable{
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println(t);
        //display threadname,priority,groupname
    }
    public static void main(String[]args){
        ThreadDemo3 td=new ThreadDemo3();
        Thread t=new Thread(td);
        t.start();
        Thread t2=Thread.currentThread();
        System.out.println(t2);
    }
}
