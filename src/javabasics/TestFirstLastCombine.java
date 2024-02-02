package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFirstLastCombine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
				//output = [1,6,2,5,3,4]   1 7 2 6 3 5 4

		int inputLengthHalf = input.size()/2;
		System.out.println("inputLengthHalf" + inputLengthHalf);
		List<Integer> output = new ArrayList<Integer>();
		for(int i = 0, j = input.size() - 1; i <= inputLengthHalf && j >= inputLengthHalf; i++,j--) {
			
			if(i == j) {
				output.add(input.get(i));
			} else {
				output.add(input.get(i));
				output.add(input.get(j));
			}
		}
		
		output.stream().forEach(i -> System.out.println(i));

	}

}
