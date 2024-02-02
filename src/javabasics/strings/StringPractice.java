package javabasics.strings;

import javabasics.java8.Employee;
import javabasics.multithreading.waitnotify.Message;

public class StringPractice {
	
	public void printString(Object s) {
		System.out.println("String as Object");
	}
	public void printString(String s) {
		System.out.println("String as String");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Trishik";
		String s1 = "Subham";
		String s2 = "Subham";
		System.out.println("s1.equals(s2) =>" + s1.equals(s2));
		System.out.println(s1 == s2);
		
	
		Integer i = new Integer(50);
		System.out.println("i.equals(50) ->" + i.equals(50));
		
		Message m1 = new Message("msg1");
		Message m2 = new Message("msg1");
		System.out.println("m1.equals(m2) =>" + m1.equals(m2));
		System.out.println("m1.hashCode=>" + m1.hashCode());
		System.out.println("m2.hashcode =>" + m2.hashCode());
		
		StringPractice sp1 = new StringPractice();
		sp1.printString(new String("Test String"));
		sp1.printString(new Employee());
		
		if("Trishik" instanceof String) {
			System.out.println("Trishik".getClass().getSimpleName() + "Instance of String");
		} else {
			System.out.println("Instance of object");
		}
	}

}
