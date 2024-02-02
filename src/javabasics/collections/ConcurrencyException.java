package javabasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrencyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("Start ConcurrencyException");
		//li.stream().filter(i -> i > 1).forEach(i -> System.out.println(i));
		//Iterator<Integer> itrli = new Iterator<Integer>(li);
		
		for(int i: li) {
			System.out.println(i);
			li.add(5);
		}
	}

}
