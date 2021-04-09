class Account{
    int amount=100;
    public synchronized void withdraw(int amount){
        if(this.amount<amount){
            System.out.println("Insuffiecient balance");
            try{
                wait();

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("withdraw sucessful");
            this.amount=this.amount-amount;
            System.out.println("Balance amount:"+this.amount);
        }
    }
    public synchronized void deposit(int amount){
        this.amount=this.amount+amount;

        System.out.println("Deposit Sucessful");
        System.out.println("Total amount:"+this.amount);
        notify();

    }
}
public class InterThreadCommunicationDemo {

    public static void main(String[]args) {
        Account obj = new Account();
        new Thread(){
            public void run(){
                obj.withdraw(1000);
            }
        }.start();
        new Thread(){
            public void run(){
                obj.deposit(5000);
            }
        }.start();
    }
}
