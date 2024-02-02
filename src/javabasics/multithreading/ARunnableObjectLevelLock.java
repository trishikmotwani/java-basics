package javabasics.multithreading;

public class ARunnableObjectLevelLock {

//	static {
//		synchronized(ARunnableObjectLevelLock.class) {
//			
//		}
//	}
	
	public static synchronized void m1() {
		try {
			
			Thread.sleep(5000);
			System.out.println("Called M1 ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
