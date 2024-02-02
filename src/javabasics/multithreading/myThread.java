package javabasics.multithreading;

public class myThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(TestNoError.obj) {
			System.out.println(Thread.currentThread().getName() + "is notifying to TestNoErro thread to start again");
			TestNoError.obj.notify();
		}
	}

}
