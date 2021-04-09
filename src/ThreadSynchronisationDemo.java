public class ThreadSynchronisationDemo extends Thread {
    int count;
    public synchronized void run(){
        for (int i=0;i<10000;i++){
            count++;
        }
    }
    public static void main(String []args){
        ThreadSynchronisationDemo tsd=new ThreadSynchronisationDemo();
        Thread t1=new Thread(tsd);
        Thread t2=new Thread(tsd);
        Thread t3=new Thread(tsd);
        System.out.println("Thread t1 is:"+t1.isAlive());//to check whether a thread is alive or not
        System.out.println(t2.getName());//to get the name of the thread
        t2.setName("Thread2"); //to set the name of a thread
        System.out.println(t2.getName());
        System.out.println("priority of thread2:"+t2.getPriority());//to get the priority of a thread
        t1.setPriority(1);//set the priority of a thread values range between 1 to 10
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread t1 is:"+t1.isAlive());
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e1){
            e1.printStackTrace();
        }

        System.out.println("Thread t1 is:"+t1.isAlive());
        System.out.println("count : "+tsd.count);
        System.out.println("Thread 1 priority: "+t1.getPriority());
        System.out.println("Thread 2 priority: "+t2.getPriority());
        System.out.println("Thread 3 priority: "+t3.getPriority());


    }
}
