package javabasics.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javabasics.java8.Employee;

public class LambdaExpressions {

	static Integer b = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[] = new int[20];
		
		Integer arr[] = {-4,1,3,2,5,1,-3,-1,4,6,7,9};
		
		//List l = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> s = new TreeSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> l = new ArrayList<Integer>(s);
		// Collections.addAll(l, s); // to add multiple collections in one collection
		System.out.println("L list is => " + l);
		
		System.out.println("Does TreeSet contain -4 -> " + s.contains(-4));
		
		
		int output = (int) l.get(l.size() - 1) + 1;
		
		for(int i =0 ;i < l.size() - 1 ; i++) {
			int value = (int) l.get(i);
			int nextValue = (int) l.get(i+1);
			if(value > 0 && nextValue != (value + 1)) {
				output = (int)(l.get(i)) + 1;
			} 
		}
		System.out.println(output);
		
		
		// filter method()
		System.out.println(l.stream().filter( a -> a > 2).collect(Collectors.toList()));
		
		
		// creating runnable using lambda expression
		Runnable r1 = () -> System.out.println("run() method overrided using lambda expression");
		
		// sort and reverse collectuon functions /// Comparator<Integer> = (s1,s2) -> s1.compareTo(s2);
		
		Collections.sort(l, (s1,s2) -> s1.compareTo(s2)); // comparator using java 8
		
		Collections.sort(l , new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		l.stream().forEach(b -> System.out.print(b + "->"));
		System.out.println("Above is sorted order, below is reverse");
		Collections.reverse(l);
		l.stream().forEach(b -> System.out.print(b + "->"));
		
		
		// mapToInt()/ map() and sum()
		System.out.println();
		System.out.println("Sum of L list" + l.stream().mapToInt(x -> x).sum());
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total sum: " + sum);
        int sumSquare = integers.stream().limit(5).filter(a -> a % 2 != 0)
        						.map(a -> a*a).mapToInt(Integer::intValue).sum();
        System.out.println("Total sum of square of odd numbers: "+ sumSquare);
        integers.stream().filter(b -> b > 1).forEach(b -> System.out.print(b + "->"));
        // sumSquare.stream().forEach(b -> System.out.println(b));
        // Using map.map() for list of integers :
        System.out.println();
        Integer a = 2;
		List<Integer> mapIntegers = integers.stream()
        	      .map(p -> p + a).map(p -> p - 1)
        	      .collect(Collectors.toList());
        System.out.println("Using map.map() for list of integers : " + mapIntegers);

        // using map() for getting HashMap of employessss
        Employee emp = new Employee();
        Map<Object, Object> hashmapEmployees = integers.stream()
      	      .map(e -> { emp.setEmpId(e); 
      	      			return emp;
      	      })
      	      .collect(Collectors.toMap(value -> value.getEmpId(), value -> value));
        System.out.println("Using map.map() for HashMap of Employees : " + hashmapEmployees);
        System.out.println();
        
        // using filter to find employee with id 1
        
        List<Employee> listEmployees = integers.stream()
        	      .map(e -> { emp.setEmpId(e); 
        	      			return emp;
        	      })
        	      .collect(Collectors.toList());
          System.out.println("Using map.map() for List  of Employees : " + listEmployees);
          System.out.println("Employee with id 1 : " + 
        		  listEmployees.stream().filter(e -> e.getEmpId() == 1).findFirst().isPresent());
        
        
        // streams.sum(), max()
        Stream<Integer> integers2 = Stream.iterate(1, n -> n + 1).limit(5);
        IntStream intStream = integers2.mapToInt(x -> x);
        int sum1 = intStream.sum();
        System.out.println("Total : " + sum1);
        
        // upper case example
        List<String> names = Arrays.asList("Pankaj", "amit", "DAVID");
        List<String> upperCaseNames = new ArrayList<>();
        for (String n : names) {
        	upperCaseNames.add(n.toUpperCase());
        }
        System.out.println("Capital Names using map ->" + names.stream().map(t -> t.toUpperCase()).collect(Collectors.toList()));
        
        
		
        // forEach()
        integers.stream().limit(4).forEach(x -> System.out.println("for Each for printing" + x + 1));
        
        // infinite stream and skip() and limit()
        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = infiniteStream
          .skip(3)
          .limit(5)
          .collect(Collectors.toList());
        System.out.println("collect List : " + collect);
		
		
		
		
		
		
        // HashSet
        HashSet hs = new HashSet();
		
		// HashMap
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
		//htable.put(1, "Found");
		htable.put(01, "Found");
		System.out.println(htable.getOrDefault(1, "Not Found"));
		System.out.println("hashmap looks like " + hmap);
		System.out.println("Cloned hashmap looks like " + hmap.clone());
		
		
	}
	
}
