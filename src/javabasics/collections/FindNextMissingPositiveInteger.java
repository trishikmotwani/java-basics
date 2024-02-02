package javabasics.collections;

import java.util.Set;
import java.util.*;

public class FindNextMissingPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[] = new int[20];
		
		Integer arr[] = {-4,1,3,2,5,1,-3,-1,4,6,7,9};
		
		//List l = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> s = new TreeSet<Integer>(Arrays.asList(arr));
		List l = new ArrayList<Integer>(s);
		// Collections.addAll(l, s); // to add multiple collections in one collection
		System.out.println(l);
		
		
		int output = (int) l.get(l.size() - 1) + 1;
		
		for(int i =0 ;i < l.size() - 1 ; i++) {
			int value = (int) l.get(i);
			int nextValue = (int) l.get(i+1);
			if(value > 0 && nextValue != (value + 1)) {
				output = (int)(l.get(i)) + 1;
			} 
		}
		System.out.println(output);
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
		//htable.put(1, "Found");
		htable.put(01, "Found");
		System.out.println(htable.getOrDefault(1, "Not Found"));
	}
}
