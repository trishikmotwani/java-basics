package javabasics.inheritance;

import java.io.IOException;

public class Animal {

	public void animalMethod1() throws Exception {
		System.out.println("animalMethod1 of Animal");
	}
	
	public void animalMethod2() throws IndexOutOfBoundsException {
		System.out.println("animalMethod2 of Animal");
	}
	
	public int bearMethod() {
		System.out.println("bearMethod1 of Bear");
		return 1;
	}
	public int polarBearMethod() {
		System.out.println("bearMethod1 of Bear");
		return 1;
	}
}
