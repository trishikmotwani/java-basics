package javabasics.inheritance;

import java.io.IOException;

public class Bear extends Animal {

	
	public void animalMethod1() throws IOException {
		System.out.println("animalMethod1 of Bear");
	}
	
	public void animalMethod2() throws IndexOutOfBoundsException {
		System.out.println("animalMethod2 of Bear");
	}
	
	public void bearMethod1() {
		System.out.println("bearMethod1 of Bear");
	}
	
	public void bearMethod2() {
		System.out.println("bearMethod2 of Bear");
	}
}
