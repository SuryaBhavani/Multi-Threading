public class ThreadSchedulerDemo implements Runnable {
    String name;
    public ThreadSchedulerDemo(String name){
        this.name=name;
    }
    public void run() {

        for (int i = 1; i <= 10; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+":"+i);
        }
    }
    public static void main(String[]args){
        ThreadSchedulerDemo ts1=new ThreadSchedulerDemo("Thread1");
        ThreadSchedulerDemo ts2=new ThreadSchedulerDemo("Thread2");
        Thread t1=new Thread(ts1);
        Thread t2=new Thread(ts2);
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException ae){
            ae.printStackTrace();
        }
        t2.start();
    }
}
