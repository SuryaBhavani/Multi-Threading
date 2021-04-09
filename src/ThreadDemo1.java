public class ThreadDemo1 extends Thread{
    public void run(){
        System.out.println("Creating a thread using Thread Class \nThe run method() is executed or called by the jvm");
    }
    public static void main(String args[]){
        ThreadDemo1 td=new ThreadDemo1();
        Thread t=new Thread(td);
        t.start();
    }
}
