package javabasics.multithreading;

public class ARunnableTest {

	
	public static void main(String[] args) throws Exception {
		ARunnableObjectLevelLock a1 = new ARunnableObjectLevelLock();
		ARunnableObjectLevelLock a2 = new ARunnableObjectLevelLock();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				a1.m1();
				
			}
				
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				a2.m1();
				
			}
				
		});
			
		t1.start();
		t2.start();
		
	}
}
