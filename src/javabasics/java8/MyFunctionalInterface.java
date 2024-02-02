package javabasics.java8;

public interface MyFunctionalInterface {

	default void myFunctionDefault() {
		System.out.println("I am a vehicle!");
	}
	public static void myFunctionStatic() {
		System.out.println("I am a vehicle!");
	}
	public void myFunction1Public();
}
