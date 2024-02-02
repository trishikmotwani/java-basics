package javabasics.multithreading.waitnotify;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter1").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter2").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");

	}

}
