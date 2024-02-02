package javabasics.multithreading;

import javabasics.AbstractTest;
import javabasics.inheritance.InterfaceTest1;
import javabasics.inheritance.InterfaceTest2;

public class TestNoError extends AbstractTest implements Runnable, InterfaceTest1, InterfaceTest2 {
	
	public static TestNoError obj = new TestNoError();
	public static void main(String[] args) {
	
		
		Thread t1 = new Thread(new TestNoError(), "TestNoError1");
		Thread t2 = new Thread(new myThread() , "TestNoErrorNotifier");
		t1.start();
		t2.start();
		String s="Trishik";
		s = "Subham";
		System.out.println(s.equals("Subham"));
		String s2 = "Subham";
		System.out.println(s == s2);
		
		System.out.println(s);
		System.out.println("Show called and returned value of  ->" + (new TestNoError()).show());
		
		AbstractTest at =  new TestNoError();
		System.out.println("Show called by AT and returned value of  ->" + at.show());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized(TestNoError.obj) {
				System.out.println(Thread.currentThread().getName() + "is calling wait now");
				TestNoError.obj.wait();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int show() {
		System.out.println(Thread.currentThread().getName() + "is calling Show()");
		return 0;
	}

}
