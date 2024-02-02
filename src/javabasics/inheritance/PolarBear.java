package javabasics.inheritance;

import java.io.IOException;

public class PolarBear extends Bear {
	
	
	public void animalMethod1() throws IOException {
		System.out.println("animalMethod1 of PolarBear");
	}
	
	public void animalMethod2() throws IndexOutOfBoundsException {
		System.out.println("animalMethod2 of PolarBear");
	}
	
	public void polarBearMethod1() {
		System.out.println("polarBearMethod2 of Bear");
	}
	
	public void polarBearMethod2() {
		System.out.println("polarBearMethod2 of Bear");
	}

}
