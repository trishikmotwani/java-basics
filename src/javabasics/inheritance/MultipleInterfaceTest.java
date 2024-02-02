package javabasics.inheritance;

import javabasics.Test;

public class MultipleInterfaceTest extends Test implements InterfaceTest1, InterfaceTest2 {

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	public static void main(String args[]) {
		MultipleInterfaceTest mit = new MultipleInterfaceTest();
		System.out.println(mit.show());
		
		Test t = new Test();
		
	}
}
