//Using multi threads
public class ThreadDemo4 implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
           try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name+"="+i);
        }
    }
    String name;
    ThreadDemo4 (String name){
        this.name=name;
    }
    public static void main(String []args){
        ThreadDemo4 td1=new ThreadDemo4("Thread1");
        ThreadDemo4 td2=new ThreadDemo4("Thread2");

        Thread t1=new Thread(td1);
        Thread t2=new Thread(td2);
        t1.start();

        t2.start();

        for(int i=0;i<=10;i++){
            System.out.println("Main ="+i);

        }
    }
}
