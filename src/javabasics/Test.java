package javabasics;

import javabasics.inheritance.InterfaceTest1;

public class Test implements Runnable, InterfaceTest1 {
	
	protected int protectedTest = 0;
	public static Test obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int temp = 9;
//		int data = 8;
//		System.out.println(temp & data);
		
//		byte var = 1;
//		var = (byte) var * 0;
		
		Thread t1 = new Thread(new Test());
		Thread t2 = new Thread(new myThread());
		t1.start();
		t2.start();
		
		String s="Trishik";
		s = "Subham";
		System.out.println(s);
		
		(new Test()).show();

	}
	@Override
	public int show() {
		System.out.println("Show iska call hua");
		return 0;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Test.obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
